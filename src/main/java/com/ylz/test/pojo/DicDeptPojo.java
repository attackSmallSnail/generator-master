package com.ylz.test.pojo;

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
 * Author lcw
 * Date  2020-07-07
 * Description 医院科室字典表
 */
@Data
@ApiModel(value = "DicDeptPojo",description = "医院科室字典表")
public class DicDeptPojo implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    private String organCode;

    @ApiModelProperty(value = "")
    private String organName;

    @ApiModelProperty(value = "")
    private String deptCode;

    @ApiModelProperty(value = "")
    private String deptName;

    @ApiModelProperty(value = "可能与科室代码相同")
    private String ksnbdm;

    @ApiModelProperty(value = "")
    private String sjksdm;

    @ApiModelProperty(value = "")
    private String bqCode;

    @ApiModelProperty(value = "")
    private String kslx;

    @ApiModelProperty(value = "")
    private String spellcode;

    @ApiModelProperty(value = "")
    private String wsjdm;

    @ApiModelProperty(value = "")
    private String ybdm;

    @ApiModelProperty(value = "")
    private String sm;

    @ApiModelProperty(value = "")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp xgsj;

    @ApiModelProperty(value = "0 可挂号 1不可挂号，默认0")
    private String ghzt;

    @ApiModelProperty(value = "CY01.01.034：是否")
    private String zyksbz;

    @ApiModelProperty(value = "")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp scsj;

    @ApiModelProperty(value = "传输到dbd数据库标志位：0未传，1已传,3失败")
    private BigDecimal transflag;

    @ApiModelProperty(value = "")
    private String sbjdm;



    public DicDeptPojo(){
    }

}