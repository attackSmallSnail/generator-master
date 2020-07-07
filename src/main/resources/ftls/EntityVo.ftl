package ${BasePackageName}${VoPackageName};

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import ${BasePackageName}${EntityPackageName}.${ClassName};
import io.swagger.annotations.ApiModel;

/**
 * Author ${Author}
 * Date  ${Date}
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "${ClassName}Vo",description = "${tableComment}-扩展类")
public class ${ClassName}Vo  extends ${ExtendClassName}{

    private static final long serialVersionUID = 1L;

    private String id;
}