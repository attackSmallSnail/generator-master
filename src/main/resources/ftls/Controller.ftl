package ${BasePackageName}${ControllerPackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName};
import ${BasePackageName}${ReqPackageName}.${ClassName}Req;
import ${BasePackageName}${VoPackageName}.${ClassName}Vo;
import ${BasePackageName}${ServicePackageName}.${ClassName}Service;
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
 * Author ${Author}
 * Date  ${Date}
 */
@Api(value = "${EntityName}Controller", description = "")
@RestController
@RequestMapping(value = "/${EntityName}Controller",produces = "application/json; charset=utf-8")
public class ${ClassName}Controller {
    @Autowired
    private ${ClassName}Service ${EntityName}Service;

    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
    @ApiOperation(value = "/list", notes = "备注")
    @ResponseBody
    public Object list() {
        List<${ClassName}> ${EntityName}s = ${EntityName}Service.findAllList();
        return ${EntityName}s;
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    @ApiOperation(value = "/get", notes = "备注")
    @ResponseBody
    public Object get(@RequestParam String id) {
        ${ClassName} ${EntityName} = ${EntityName}Service.get(id);
        return ${EntityName};
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "/insert", notes = "备注")
    @ResponseBody
    public String insert(@RequestBody ${ClassName} ${EntityName}) {
        if (${EntityName}Service.insert(${EntityName}) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    @ApiOperation(value = "/insertBatch", notes = "备注")
    @ResponseBody
    public String insertBatch(@RequestBody List<${ClassName}> ${EntityName}s) {
        if (${EntityName}Service.insertBatch(${EntityName}s) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "/update", notes = "备注")
    @ResponseBody
    public String update(@RequestBody ${ClassName} ${EntityName}) {
        if (${EntityName}Service.update(${EntityName}) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ApiOperation(value = "/delete", notes = "备注")
    @ResponseBody
    public String delete(@RequestBody ${ClassName} ${EntityName}) {
        if (${EntityName}Service.delete(${EntityName}) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = {"/findListByReq"}, method = RequestMethod.POST)
    @ApiOperation(value = "/findListByReq", notes = "备注")
    @ResponseBody
    public Object findListByReq(@RequestBody ${ClassName}Req ${EntityName}Req) {
        List<${ClassName}Vo> ${EntityName}Vos = ${EntityName}Service.findListByReq(${EntityName}Req);
        return ${EntityName}Vos;
    }

    @RequestMapping(value = {"/addOrUpdate"}, method = RequestMethod.POST)
    @ApiOperation(value = "/addOrUpdate", notes = "新增或者修改")
    @ResponseBody
    public Object addOrUpdate(@RequestBody ${ClassName}Vo ${EntityName}Vo) {
        ${EntityName}Service.addOrUpdate(${EntityName}Vo);
        return "success";
    }

    @RequestMapping(value = {"/deleteById"}, method = RequestMethod.POST)
    @ApiOperation(value = "/deleteById", notes = "逻辑删除")
    @ResponseBody
    public Object deleteById(@RequestBody ${ClassName}Req ${EntityName}Req) {
        ${EntityName}Service.deleteById(${EntityName}Req);
        return "success";
    }

}
