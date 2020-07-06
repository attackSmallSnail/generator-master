package ${BasePackageName}${VoPackageName};

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import ${BasePackageName}${EntityPackageName}.${ClassName};

/**
 * Author ${Author}
 * Date  ${Date}
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ${ClassName}Vo  extends ${ExtendClassName}{

    private static final long serialVersionUID = 1L;

    private String id;
}