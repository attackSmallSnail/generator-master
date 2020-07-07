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
public class VoTask extends AbstractTask {

    public VoTask(String className) {
        super(className);
    }

    @Override
    public void run() throws IOException, TemplateException {
        // 生成Dao填充数据
        System.out.println("Generating " + className + "Vo.java");
        Map<String, String> voData = new HashMap<>();
        voData.put("BasePackageName", ConfigUtil.getConfiguration().getPackageName());
        voData.put("VoPackageName", ConfigUtil.getConfiguration().getPath().getVo());
        voData.put("EntityPackageName", ConfigUtil.getConfiguration().getPath().getEntity());
        voData.put("Author", ConfigUtil.getConfiguration().getAuthor());
        voData.put("Date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        voData.put("ClassName", className);
        voData.put("EntityName", StringUtil.firstToLowerCase(className));
        voData.put("ExtendClassName",className);
        voData.put("tableComment",null != staticsTableInfos ? staticsTableInfos.get(0).getTableComments() : className);
        String filePath = FileUtil.getSourcePath() + StringUtil.package2Path(ConfigUtil.getConfiguration().getPackageName()) + StringUtil.package2Path(ConfigUtil.getConfiguration().getPath().getVo());
        String fileName = className + "Vo.java";
        // 生成dao文件
        FileUtil.generateToJava(FreemarketConfigUtils.TYPE_VO, voData, filePath + fileName);
    }
}
