package ${BasePackageName}${ReqPackageName};

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * Author ${Author}
 * Date  ${Date}
 */
@Data
@ApiModel(value = "${ClassName}Req请求实体类",description = "${tableComment}-请求实体类")
public class ${ClassName}Req  {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "测试列",example = "1")
    private String testColumn;

}