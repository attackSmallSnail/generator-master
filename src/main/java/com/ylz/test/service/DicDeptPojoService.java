package com.ylz.test.service;

import com.ylz.test.pojo.DicDeptPojo;
import com.ylz.test.req.DicDeptPojoReq;
import com.ylz.test.vo.DicDeptPojoVo;
import java.util.List;

/**
 * Author lcw
 * Date  2020-07-07
 */
public interface DicDeptPojoService {

    DicDeptPojo get(String id);

    List<DicDeptPojo> findAllList();

    int insert(DicDeptPojo dicDeptPojo);

    int insertBatch(List<DicDeptPojo> dicDeptPojos);

    int update(DicDeptPojo dicDeptPojo);

    int delete(DicDeptPojo dicDeptPojo);

    /**
     * @Description 查找列表
     * @Author lcw
     * @Date 2020-07-07
     * @Param
     * @Return
     */
    List<DicDeptPojoVo> findListByReq(DicDeptPojoReq dicDeptPojoReq);

    /**
    * @Description 新增或者修改
    * @Author lcw
    * @Date 2020-07-07
    * @Param
    * @Return
    */
    void addOrUpdate(DicDeptPojoVo dicDeptPojoVo);

    /**
    * @Description 逻辑删除
    * @Author lcw
    * @Date 2020-07-07
    * @Param
    * @Return
    */
    void deleteById(DicDeptPojoReq dicDeptPojoReq);
}
