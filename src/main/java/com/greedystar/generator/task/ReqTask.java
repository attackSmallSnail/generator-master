package com.greedystar.generator.task;

import com.greedystar.generator.entity.ColumnInfo;
import com.greedystar.generator.task.base.AbstractTask;
import com.greedystar.generator.utils.ConfigUtil;
import com.greedystar.generator.utils.FileUtil;
import com.greedystar.generator.utils.FreemarketConfigUtils;
import com.greedystar.generator.utils.StringUtil;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author GreedyStar
 * Date   2018/4/20
 */
public class ReqTask extends AbstractTask {

    public ReqTask(String className) {
        super(className);
    }

    @Override
    public void run() throws IOException, TemplateException {
        // 生成Dao填充数据
        System.out.println("Generating " + className + "Req.java");
        Map<String, String> reqData = new HashMap<>();
        reqData.put("BasePackageName", ConfigUtil.getConfiguration().getPackageName());
        reqData.put("ReqPackageName", ConfigUtil.getConfiguration().getPath().getReq());
        reqData.put("EntityPackageName", ConfigUtil.getConfiguration().getPath().getEntity());
        reqData.put("Author", ConfigUtil.getConfiguration().getAuthor());
        reqData.put("Date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        reqData.put("ClassName", className);
        reqData.put("EntityName", StringUtil.firstToLowerCase(className));
        reqData.put("ExtendClassName",className);
        reqData.put("tableComment",null != staticsTableInfos ? staticsTableInfos.get(0).getTableComments() : className);
        String filePath = FileUtil.getSourcePath() + StringUtil.package2Path(ConfigUtil.getConfiguration().getPackageName()) + StringUtil.package2Path(ConfigUtil.getConfiguration().getPath().getReq());
        String fileName = className + "Req.java";
        // 生成dao文件
        FileUtil.generateToJava(FreemarketConfigUtils.TYPE_REQ, reqData, filePath + fileName);
    }
}
