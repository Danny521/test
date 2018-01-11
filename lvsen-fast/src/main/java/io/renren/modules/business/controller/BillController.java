package io.renren.modules.business.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(tags = { "账单" })
@RequestMapping({ "/bill" })
public class BillController extends BaseController{

    @ApiOperation(value = "获取账单列表", httpMethod = "GET", notes = "获取全部账单的列表")
    @GetMapping(path = "/list")
    @ResponseBody
    public R list(HttpServletRequest request, @ApiParam(name = "key", value = "任意模糊关键字(账单编号,客户名称)", required = false) String key,
            @ApiParam(name = "beginTime", value = "起始时间", required = false) String beginTime,
            @ApiParam(name = "endTime", value = "截止时间", required = false) String endTime,
            @ApiParam(name = "currentPage", value = "当前页码", required = false) Integer currentPage,
            @ApiParam(name = "pageSize", value = "每页数量", required = false) Integer pageSize,
            @ApiParam(name = "status", value = "状态", required = false, defaultValue = "1") Integer status) {
        // TODO
        return R.ok();
    }

    @ApiOperation(value = "获取账单详细信息", httpMethod = "GET", notes = "根据指定ID获取账单的详细信息")
    @GetMapping(path = "/{id}")
    @ResponseBody
    public R get(HttpServletRequest request, @PathVariable @ApiParam(name = "id", value = "账单ID", required = true) Integer id) {
        // TODO
        return R.ok();
    }

}