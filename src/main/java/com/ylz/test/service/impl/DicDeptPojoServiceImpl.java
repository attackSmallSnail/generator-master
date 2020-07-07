package com.ylz.test.service.impl;

import com.ylz.test.dao.DicDeptPojoMapper;
import com.ylz.test.pojo.DicDeptPojo;
import com.ylz.test.req.DicDeptPojoReq;
import com.ylz.test.vo.DicDeptPojoVo;
import com.ylz.test.service.DicDeptPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Author lcw
 * Date  2020-07-07
 */
@Service
public class DicDeptPojoServiceImpl implements DicDeptPojoService {
    @Autowired
    private DicDeptPojoMapper dicDeptPojoMapper;
    
    @Override
    public DicDeptPojo get(String id){
        return dicDeptPojoMapper.get(id);
    }



    
    @Override
    public List<DicDeptPojo> findAllList() {
        return dicDeptPojoMapper.findAllList();
    }
    
    @Override
    public int insert(DicDeptPojo dicDeptPojo) {
        return dicDeptPojoMapper.insert(dicDeptPojo);
    }
    
    @Override
    public int insertBatch(List<DicDeptPojo> dicDeptPojos){
        return dicDeptPojoMapper.insertBatch(dicDeptPojos);
    }
    
    @Override
    public int update(DicDeptPojo dicDeptPojo) {
        return dicDeptPojoMapper.update(dicDeptPojo);
    }
    
    @Override
    public int delete(DicDeptPojo dicDeptPojo) {
        return dicDeptPojoMapper.delete(dicDeptPojo);
    }


    /**
     * @Description 查找列表
     * @Author lcw
     * @Date 2020-07-07
     * @Param
     * @Return
     */
    
    @Override
    public List<DicDeptPojoVo> findListByReq(DicDeptPojoReq dicDeptPojoReq) {
        return dicDeptPojoMapper.findListByReq(dicDeptPojoReq);
    }

    /**
    * @Description 新增或者修改
    * @Author lcw
    * @Date 2020-07-07
    * @Param
    * @Return
    */
    
    @Override
    public void addOrUpdate(DicDeptPojoVo dicDeptPojoVo) {
        DicDeptPojo dicDeptPojo = new DicDeptPojo();
        //新增
        if(StringUtils.isEmpty(dicDeptPojoVo.getId())){
            String id = "新增id";
            //dicDeptPojo.setId(id);
            BeanUtil.copyProperties(dicDeptPojoVo,dicDeptPojo,true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
            dicDeptPojoMapper.insert(dicDeptPojo);
        }else{
            BeanUtil.copyProperties(dicDeptPojoVo,dicDeptPojo,true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
            dicDeptPojoMapper.update(dicDeptPojo);
    }
    }

    /**
    * @Description 逻辑删除
    * @Author lcw
    * @Date 2020-07-07
    * @Param
    * @Return
    */
    
    @Override
    public void deleteById(DicDeptPojoReq dicDeptPojoReq) {
        DicDeptPojo dicDeptPojo = new DicDeptPojo();
        BeanUtil.copyProperties(dicDeptPojoReq,dicDeptPojo,true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        dicDeptPojoMapper.update(dicDeptPojo);
    }
}
