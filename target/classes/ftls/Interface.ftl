package ${BasePackageName}${InterfacePackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName};
import ${BasePackageName}${ReqPackageName}.${ClassName}Req;
import ${BasePackageName}${VoPackageName}.${ClassName}Vo;
import java.util.List;

/**
 * Author ${Author}
 * Date  ${Date}
 */
public interface ${ClassName}Service {

    ${ClassName} get(String id);

    List<${ClassName}> findAllList();

    int insert(${ClassName} ${EntityName});

    int insertBatch(List<${ClassName}> ${EntityName}s);

    int update(${ClassName} ${EntityName});

    int delete(${ClassName} ${EntityName});

    /**
     * @Description 查找列表
     * @Author ${Author}
     * @Date ${Date}
     * @Param
     * @Return
     */
    List<${ClassName}Vo> findListByReq(${ClassName}Req ${EntityName}Req);

    /**
    * @Description 新增或者修改
    * @Author ${Author}
    * @Date ${Date}
    * @Param
    * @Return
    */
    void addOrUpdate(${ClassName}Vo ${EntityName}Vo);

    /**
    * @Description 逻辑删除
    * @Author ${Author}
    * @Date ${Date}
    * @Param
    * @Return
    */
    void deleteById(${ClassName}Req ${EntityName}Req);
}
