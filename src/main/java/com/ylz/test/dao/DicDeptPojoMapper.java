package com.ylz.test.dao;

import com.ylz.test.pojo.DicDeptPojo;
import com.ylz.test.req.DicDeptPojoReq;
import com.ylz.test.vo.DicDeptPojoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lcw
 * Date  2020-07-07
 */
@Mapper
public interface DicDeptPojoMapper {

     DicDeptPojo get(String id);

     List<DicDeptPojo> findAllList();

     int insert(DicDeptPojo dicDeptPojo);

     int insertBatch(List<DicDeptPojo> dicDeptPojos);

     int update(DicDeptPojo dicDeptPojo);

     int delete(DicDeptPojo dicDeptPojo);

     List<DicDeptPojo> findList(DicDeptPojo dicDeptPojo);

     List<DicDeptPojoVo> findListByReq(DicDeptPojoReq dicDeptPojoReq);

}