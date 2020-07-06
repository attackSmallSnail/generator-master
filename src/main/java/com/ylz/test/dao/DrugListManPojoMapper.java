package com.ylz.test.dao;

import com.ylz.test.pojo.DrugListManPojo;
import com.ylz.test.req.DrugListManPojoReq;
import com.ylz.test.vo.DrugListManPojoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lcw
 * Date  2020-07-06
 */
@Mapper
public interface DrugListManPojoMapper {

     DrugListManPojo get(String id);

     List<DrugListManPojo> findAllList();

     int insert(DrugListManPojo drugListManPojo);

     int insertBatch(List<DrugListManPojo> drugListManPojos);

     int update(DrugListManPojo drugListManPojo);

     int delete(DrugListManPojo drugListManPojo);

     List<DrugListManPojo> findList(DrugListManPojo drugListManPojo);

     List<DrugListManPojoVo> findListByReq(DrugListManPojoReq drugListManPojoReq);

}