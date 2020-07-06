package com.ylz.test.controller;

import com.ylz.test.pojo.DrugListManPojo;
import com.ylz.test.req.DrugListManPojoReq;
import com.ylz.test.vo.DrugListManPojoVo;
import com.ylz.test.service.DrugListManPojoService;
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
 * Date  2020-07-06
 */
@Api(value = "drugListManPojoController", description = "")
@RestController
@RequestMapping(value = "/drugListManPojoController",produces = "application/json; charset=utf-8")
public class DrugListManPojoController {
    @Autowired
    private DrugListManPojoService drugListManPojoService;

    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
    @ApiOperation(value = "/list", notes = "备注")
    @ResponseBody
    public Object list() {
        List<DrugListManPojo> drugListManPojos = drugListManPojoService.findAllList();
        return drugListManPojos;
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    @ApiOperation(value = "/get", notes = "备注")
    @ResponseBody
    public Object get(@RequestParam String id) {
        DrugListManPojo drugListManPojo = drugListManPojoService.get(id);
        return drugListManPojo;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "/insert", notes = "备注")
    @ResponseBody
    public String insert(@RequestBody DrugListManPojo drugListManPojo) {
        if (drugListManPojoService.insert(drugListManPojo) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    @ApiOperation(value = "/insertBatch", notes = "备注")
    @ResponseBody
    public String insertBatch(@RequestBody List<DrugListManPojo> drugListManPojos) {
        if (drugListManPojoService.insertBatch(drugListManPojos) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "/update", notes = "备注")
    @ResponseBody
    public String update(@RequestBody DrugListManPojo drugListManPojo) {
        if (drugListManPojoService.update(drugListManPojo) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ApiOperation(value = "/delete", notes = "备注")
    @ResponseBody
    public String delete(@RequestBody DrugListManPojo drugListManPojo) {
        if (drugListManPojoService.delete(drugListManPojo) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = {"/findListByReq"}, method = RequestMethod.POST)
    @ApiOperation(value = "/findListByReq", notes = "备注")
    @ResponseBody
    public Object findListByReq(@RequestBody DrugListManPojoReq drugListManPojoReq) {
        List<DrugListManPojoVo> drugListManPojoVos = drugListManPojoService.findListByReq(drugListManPojoReq);
        return drugListManPojoVos;
    }

    @RequestMapping(value = {"/addOrUpdate"}, method = RequestMethod.POST)
    @ApiOperation(value = "/addOrUpdate", notes = "新增或者修改")
    @ResponseBody
    public Object addOrUpdate(@RequestBody DrugListManPojoVo drugListManPojoVo) {
        drugListManPojoService.addOrUpdate(drugListManPojoVo);
        return "success";
    }

    @RequestMapping(value = {"/deleteById"}, method = RequestMethod.POST)
    @ApiOperation(value = "/deleteById", notes = "逻辑删除")
    @ResponseBody
    public Object deleteById(@RequestBody DrugListManPojoReq drugListManPojoReq) {
        drugListManPojoService.deleteById(drugListManPojoReq);
        return "success";
    }

}
