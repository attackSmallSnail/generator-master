package com.ylz.test.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * Author lcw
 * Date  2020-07-07
 */
@Data
@ApiModel(value = "DicDeptPojoReq请求实体类",description = "DicDeptPojoReq请求实体类")
public class DicDeptPojoReq  {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "测试列",example = "1")
    private String testColumn;

}