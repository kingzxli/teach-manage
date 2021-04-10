package com.xrjj.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BaseCity implements Serializable{
	private static final long serialVersionUID = 1L;

	private String id;
	
	@ApiModelProperty(value = "上级id")
	private String parentId;
	
	@ApiModelProperty(value = "区域名称")
	private String cityName;
	
	@ApiModelProperty(value = "级别(0:国,1:省,2:市,3区县)",example = "1")
	private Integer cityLevel;
	
}
