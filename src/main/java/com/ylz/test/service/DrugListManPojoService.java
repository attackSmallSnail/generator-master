package com.ylz.test.service;

import com.ylz.test.pojo.DrugListManPojo;
import com.ylz.test.req.DrugListManPojoReq;
import com.ylz.test.vo.DrugListManPojoVo;
import java.util.List;

/**
 * Author lcw
 * Date  2020-07-06
 */
public interface DrugListManPojoService {

    DrugListManPojo get(String id);

    List<DrugListManPojo> findAllList();

    int insert(DrugListManPojo drugListManPojo);

    int insertBatch(List<DrugListManPojo> drugListManPojos);

    int update(DrugListManPojo drugListManPojo);

    int delete(DrugListManPojo drugListManPojo);

    /**
     * @Description 查找列表
     * @Author lcw
     * @Date 2020-07-06
     * @Param
     * @Return
     */
    List<DrugListManPojoVo> findListByReq(DrugListManPojoReq drugListManPojoReq);

    /**
    * @Description 新增或者修改
    * @Author lcw
    * @Date 2020-07-06
    * @Param
    * @Return
    */
    void addOrUpdate(DrugListManPojoVo drugListManPojoVo);

    /**
    * @Description 逻辑删除
    * @Author lcw
    * @Date 2020-07-06
    * @Param
    * @Return
    */
    void deleteById(DrugListManPojoReq drugListManPojoReq);
}
