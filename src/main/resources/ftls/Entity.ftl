package ${BasePackageName}${EntityPackageName};

import java.io.Serializable;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Author ${Author}
 * Date  ${Date}
 * Description ${tableComment}
 */
@Data
@ApiModel(value = "${ClassName}",description = "${tableComment}")
public class ${ClassName} implements Serializable {
    private static final long serialVersionUID = 1L;
    ${Properties}

    public ${ClassName}(){
    }

    <#--不要使用默认的方法,使用注解的方式-->
    <#--${Methods}-->
}