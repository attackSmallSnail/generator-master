package com.greedystar.generator.db;


import cn.hutool.json.JSONObject;
import com.greedystar.generator.entity.ColumnInfo;
import com.greedystar.generator.utils.ConfigUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author GreedyStar
 * Date   2018/4/19
 */
public class ConnectionUtil {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    /**
     * 初始化数据库连接
     *
     * @return
     */
    public boolean initConnection() {
        try {
            Class.forName(DriverFactory.getDriver(ConfigUtil.getConfiguration().getDb().getUrl()));
            String url = ConfigUtil.getConfiguration().getDb().getUrl();
            String username = ConfigUtil.getConfiguration().getDb().getUsername();
            String password = ConfigUtil.getConfiguration().getDb().getPassword();
            connection = DriverManager.getConnection(url, username, password);
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 获取表结构数据
     *
     * @param tableName 表名
     * @return 包含表结构数据的列表
     */
    public List<ColumnInfo> getMetaData(String tableName) throws SQLException {
        ResultSet tempResultSet = connection.getMetaData().getPrimaryKeys(null, null, tableName);
        String primaryKey = null;
        if (tempResultSet.next()) {
            primaryKey = tempResultSet.getObject(4).toString();
        }
        List<ColumnInfo> columnInfos = new ArrayList<>();
        statement = connection.createStatement();
        String sql = "SELECT * FROM " + tableName + " WHERE 1 != 1";
        resultSet = statement.executeQuery(sql);
        ResultSetMetaData metaData = resultSet.getMetaData();
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            ColumnInfo info;
            if (metaData.getColumnName(i).equals(primaryKey)) {
                info = new ColumnInfo(metaData.getColumnName(i), metaData.getColumnType(i), true);
            } else {
                info = new ColumnInfo(metaData.getColumnName(i), metaData.getColumnType(i), false);
            }
            columnInfos.add(info);
        }
        sql = "select a.COLUMN_NAME,a.COMMENTS,b.COMMENTS as TABLE_COMMENT from user_col_comments a left join user_tab_comments b on a.TABLE_NAME=b.TABLE_NAME where a.TABLE_NAME='"+tableName+"'";
        resultSet = statement.executeQuery(sql);
        Map<String,String> columnMap = new HashMap<String,String>();
        String tableComment = "";
        while(resultSet.next()){
            tableComment = resultSet.getString("TABLE_COMMENT");
            columnMap.put(resultSet.getString("COLUMN_NAME"),resultSet.getString("COMMENTS"));
        }
//        System.out.println(columnMap);
        for (ColumnInfo info: columnInfos){
            info.setTableComments(tableComment);
            if (null == columnMap.get(info.getColumnName()) || "".equals(columnMap.get(info.getColumnName())) ){
                continue;
            }
            info.setComments(columnMap.get(info.getColumnName()));
        }
        statement.close();
        resultSet.close();
        return columnInfos;
    }

    public void close() {
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
