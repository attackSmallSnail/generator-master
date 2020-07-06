package ${BasePackageName}${EntityPackageName};

import java.io.Serializable;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import lombok.Data;
/**
 * Author ${Author}
 * Date  ${Date}
 */
@Data
public class ${ClassName} implements Serializable {
    private static final long serialVersionUID = 1L;
    ${Properties}

    public ${ClassName}(){
    }

    <#--不要使用默认的方法,使用注解的方式-->
    <#--${Methods}-->
}