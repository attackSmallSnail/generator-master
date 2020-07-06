package ${BasePackageName}${ServicePackageName};

import ${BasePackageName}${DaoPackageName}.${ClassName}Mapper;
import ${BasePackageName}${EntityPackageName}.${ClassName};
import ${BasePackageName}${ReqPackageName}.${ClassName}Req;
import ${BasePackageName}${VoPackageName}.${ClassName}Vo;
${InterfaceImport}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Author ${Author}
 * Date  ${Date}
 */
@Service
public class ${ClassName}Service${Impl} {
    @Autowired
    private ${ClassName}Mapper ${EntityName}Mapper;
    ${Override}
    public ${ClassName} get(String id){
        return ${EntityName}Mapper.get(id);
    }



    ${Override}
    public List<${ClassName}> findAllList() {
        return ${EntityName}Mapper.findAllList();
    }
    ${Override}
    public int insert(${ClassName} ${EntityName}) {
        return ${EntityName}Mapper.insert(${EntityName});
    }
    ${Override}
    public int insertBatch(List<${ClassName}> ${EntityName}s){
        return ${EntityName}Mapper.insertBatch(${EntityName}s);
    }
    ${Override}
    public int update(${ClassName} ${EntityName}) {
        return ${EntityName}Mapper.update(${EntityName});
    }
    ${Override}
    public int delete(${ClassName} ${EntityName}) {
        return ${EntityName}Mapper.delete(${EntityName});
    }


    /**
     * @Description 查找列表
     * @Author ${Author}
     * @Date ${Date}
     * @Param
     * @Return
     */
    ${Override}
    public List<${ClassName}Vo> findListByReq(${ClassName}Req ${EntityName}Req) {
        return ${EntityName}Mapper.findListByReq(${EntityName}Req);
    }

    /**
    * @Description 新增或者修改
    * @Author ${Author}
    * @Date ${Date}
    * @Param
    * @Return
    */
    ${Override}
    public void addOrUpdate(${ClassName}Vo ${EntityName}Vo) {
        ${ClassName} ${EntityName} = new ${ClassName}();
        //新增
        if(StringUtils.isEmpty(${EntityName}Vo.getId())){
            String id = "新增id";
            //${EntityName}.setId(id);
            BeanUtil.copyProperties(${EntityName}Vo,${EntityName},true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
            ${EntityName}Mapper.insert(${EntityName});
        }else{
            BeanUtil.copyProperties(${EntityName}Vo,${EntityName},true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
            ${EntityName}Mapper.update(${EntityName});
    }
    }

    /**
    * @Description 逻辑删除
    * @Author ${Author}
    * @Date ${Date}
    * @Param
    * @Return
    */
    ${Override}
    public void deleteById(${ClassName}Req ${EntityName}Req) {
        ${ClassName} ${EntityName} = new ${ClassName}();
        BeanUtil.copyProperties(${EntityName}Req,${EntityName},true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        ${EntityName}Mapper.update(${EntityName});
    }
}
