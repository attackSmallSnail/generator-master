package com.ylz.test.pojo;

import java.io.Serializable;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import lombok.Data;
/**
 * Author lcw
 * Date  2020-07-06
 */
@Data
public class DrugListManPojo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String orgId;
    private String orgName;
    private String userId;
    private String userName;
    private Timestamp createDate;
    private Timestamp updateDate;
    private String isDelete;
    private String effectiveFlag;
    private String listManId;
    private String listManName;
    private String defFlag;
    private String manFlag;
    private String outHosType;
    private String remark;
    private String publicFlag;


    public DrugListManPojo(){
    }

}