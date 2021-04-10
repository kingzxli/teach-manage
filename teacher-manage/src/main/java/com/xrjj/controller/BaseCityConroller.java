package com.xrjj.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageInfo;
import com.xrjj.entity.BaseCity;
import com.xrjj.entity.Result;
import com.xrjj.service.BaseCityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "区域管理")
@RestController
public class BaseCityConroller {
	
	@Autowired
	private BaseCityService baseCityService;
	
	/**
	 * @param parentId 上级Id
	 * @param cityName 区域名称(可以模糊查询)
	 * @param cityLevel 级别(0:国,1:省,2:市,3区县)
	 * @return
	 */
	@ApiOperation(value = "列表查询")
	@GetMapping("/baseCity")
	public Result<List<BaseCity>> list(BaseCity baseCity) {	
		List<BaseCity> list = baseCityService.list(baseCity);
		return new Result<>(list).total(new PageInfo<BaseCity>(list).getTotal());
	}
	
	
}
