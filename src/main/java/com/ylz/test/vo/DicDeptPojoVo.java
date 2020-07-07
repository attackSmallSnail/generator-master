package com.ylz.test.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ylz.test.pojo.DicDeptPojo;

/**
 * Author lcw
 * Date  2020-07-07
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DicDeptPojoVo  extends DicDeptPojo{

    private static final long serialVersionUID = 1L;

    private String id;
}