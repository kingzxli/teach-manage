package com.xrjj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xrjj.entity.BaseCity;
import com.xrjj.mapper.BaseCityMapper;
import com.xrjj.service.BaseCityService;


@Service
public class BaseCityServiceImpl implements BaseCityService{

	@Autowired
	private BaseCityMapper baseCityMapper;

	@Override
	public List<BaseCity> list(BaseCity baseCity) {
		QueryWrapper<BaseCity> wrapper = new QueryWrapper<>(baseCity);
		return baseCityMapper.selectList(wrapper);
	}

	
}
