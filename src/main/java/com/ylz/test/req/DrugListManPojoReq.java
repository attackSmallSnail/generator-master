package com.ylz.test.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * Author lcw
 * Date  2020-07-06
 */
@Data
@ApiModel(value = "DrugListManPojoReq请求实体类",description = "DrugListManPojoReq请求实体类")
public class DrugListManPojoReq  {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "测试列",example = "1")
    private String testColumn;

}