package com.ylz.test.controller;

import com.ylz.test.pojo.DicDeptPojo;
import com.ylz.test.req.DicDeptPojoReq;
import com.ylz.test.vo.DicDeptPojoVo;
import com.ylz.test.service.DicDeptPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import java.util.List;

/**
 * Author lcw
 * Date  2020-07-07
 */
@Api(value = "dicDeptPojoController", description = "")
@RestController
@RequestMapping(value = "/dicDeptPojoController",produces = "application/json; charset=utf-8")
public class DicDeptPojoController {
    @Autowired
    private DicDeptPojoService dicDeptPojoService;

    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
    @ApiOperation(value = "/list", notes = "备注")
    @ResponseBody
    public Object list() {
        List<DicDeptPojo> dicDeptPojos = dicDeptPojoService.findAllList();
        return dicDeptPojos;
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    @ApiOperation(value = "/get", notes = "备注")
    @ResponseBody
    public Object get(@RequestParam String id) {
        DicDeptPojo dicDeptPojo = dicDeptPojoService.get(id);
        return dicDeptPojo;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "/insert", notes = "备注")
    @ResponseBody
    public String insert(@RequestBody DicDeptPojo dicDeptPojo) {
        if (dicDeptPojoService.insert(dicDeptPojo) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    @ApiOperation(value = "/insertBatch", notes = "备注")
    @ResponseBody
    public String insertBatch(@RequestBody List<DicDeptPojo> dicDeptPojos) {
        if (dicDeptPojoService.insertBatch(dicDeptPojos) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "/update", notes = "备注")
    @ResponseBody
    public String update(@RequestBody DicDeptPojo dicDeptPojo) {
        if (dicDeptPojoService.update(dicDeptPojo) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ApiOperation(value = "/delete", notes = "备注")
    @ResponseBody
    public String delete(@RequestBody DicDeptPojo dicDeptPojo) {
        if (dicDeptPojoService.delete(dicDeptPojo) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = {"/findListByReq"}, method = RequestMethod.POST)
    @ApiOperation(value = "/findListByReq", notes = "备注")
    @ResponseBody
    public Object findListByReq(@RequestBody DicDeptPojoReq dicDeptPojoReq) {
        List<DicDeptPojoVo> dicDeptPojoVos = dicDeptPojoService.findListByReq(dicDeptPojoReq);
        return dicDeptPojoVos;
    }

    @RequestMapping(value = {"/addOrUpdate"}, method = RequestMethod.POST)
    @ApiOperation(value = "/addOrUpdate", notes = "新增或者修改")
    @ResponseBody
    public Object addOrUpdate(@RequestBody DicDeptPojoVo dicDeptPojoVo) {
        dicDeptPojoService.addOrUpdate(dicDeptPojoVo);
        return "success";
    }

    @RequestMapping(value = {"/deleteById"}, method = RequestMethod.POST)
    @ApiOperation(value = "/deleteById", notes = "逻辑删除")
    @ResponseBody
    public Object deleteById(@RequestBody DicDeptPojoReq dicDeptPojoReq) {
        dicDeptPojoService.deleteById(dicDeptPojoReq);
        return "success";
    }

}
