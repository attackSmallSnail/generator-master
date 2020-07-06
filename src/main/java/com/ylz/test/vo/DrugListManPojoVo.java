package com.ylz.test.vo;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ylz.test.pojo.DrugListManPojo;

/**
 * Author lcw
 * Date  2020-07-06
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DrugListManPojoVo  extends DrugListManPojo{

    private static final long serialVersionUID = 1L;

    private String id;
}