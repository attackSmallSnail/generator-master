package com.ylz.test.service.impl;

import com.ylz.test.dao.DrugListManPojoMapper;
import com.ylz.test.pojo.DrugListManPojo;
import com.ylz.test.req.DrugListManPojoReq;
import com.ylz.test.vo.DrugListManPojoVo;
import com.ylz.test.service.DrugListManPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Author lcw
 * Date  2020-07-06
 */
@Service
public class DrugListManPojoServiceImpl implements DrugListManPojoService {
    @Autowired
    private DrugListManPojoMapper drugListManPojoMapper;
    
    @Override
    public DrugListManPojo get(String id){
        return drugListManPojoMapper.get(id);
    }



    
    @Override
    public List<DrugListManPojo> findAllList() {
        return drugListManPojoMapper.findAllList();
    }
    
    @Override
    public int insert(DrugListManPojo drugListManPojo) {
        return drugListManPojoMapper.insert(drugListManPojo);
    }
    
    @Override
    public int insertBatch(List<DrugListManPojo> drugListManPojos){
        return drugListManPojoMapper.insertBatch(drugListManPojos);
    }
    
    @Override
    public int update(DrugListManPojo drugListManPojo) {
        return drugListManPojoMapper.update(drugListManPojo);
    }
    
    @Override
    public int delete(DrugListManPojo drugListManPojo) {
        return drugListManPojoMapper.delete(drugListManPojo);
    }


    /**
     * @Description 查找列表
     * @Author lcw
     * @Date 2020-07-06
     * @Param
     * @Return
     */
    
    @Override
    public List<DrugListManPojoVo> findListByReq(DrugListManPojoReq drugListManPojoReq) {
        return drugListManPojoMapper.findListByReq(drugListManPojoReq);
    }

    /**
    * @Description 新增或者修改
    * @Author lcw
    * @Date 2020-07-06
    * @Param
    * @Return
    */
    
    @Override
    public void addOrUpdate(DrugListManPojoVo drugListManPojoVo) {
        DrugListManPojo drugListManPojo = new DrugListManPojo();
        //新增
        if(StringUtils.isEmpty(drugListManPojoVo.getId())){
            String id = "新增id";
            //drugListManPojo.setId(id);
            BeanUtil.copyProperties(drugListManPojoVo,drugListManPojo,true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
            drugListManPojoMapper.insert(drugListManPojo);
        }else{
            BeanUtil.copyProperties(drugListManPojoVo,drugListManPojo,true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
            drugListManPojoMapper.update(drugListManPojo);
    }
    }

    /**
    * @Description 逻辑删除
    * @Author lcw
    * @Date 2020-07-06
    * @Param
    * @Return
    */
    
    @Override
    public void deleteById(DrugListManPojoReq drugListManPojoReq) {
        DrugListManPojo drugListManPojo = new DrugListManPojo();
        BeanUtil.copyProperties(drugListManPojoReq,drugListManPojo,true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        drugListManPojoMapper.update(drugListManPojo);
    }
}
