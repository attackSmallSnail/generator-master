package ${BasePackageName}${DaoPackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName};
import ${BasePackageName}${ReqPackageName}.${ClassName}Req;
import ${BasePackageName}${VoPackageName}.${ClassName}Vo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author ${Author}
 * Date  ${Date}
 */
@Mapper
public interface ${ClassName}Mapper {

     ${ClassName} get(String id);

     List<${ClassName}> findAllList();

     int insert(${ClassName} ${EntityName});

     int insertBatch(List<${ClassName}> ${EntityName}s);

     int update(${ClassName} ${EntityName});

     int delete(${ClassName} ${EntityName});

     List<${ClassName}> findList(${ClassName} ${EntityName});

     List<${ClassName}Vo> findListByReq(${ClassName}Req ${EntityName}Req);

}