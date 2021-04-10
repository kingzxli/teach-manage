package com.xrjj.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageInfo;
import com.xrjj.entity.Page;
import com.xrjj.entity.Result;
import com.xrjj.entity.User;
import com.xrjj.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "用户管理")
@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;

	@ApiOperation(value = "列表查询")
	@GetMapping("/user")
	public Result<List<User>> list(Page page,User user) {	
		page.paging();			
		List<User> list = userService.list(user);
		return new Result<>(list).total(new PageInfo<User>(list).getTotal());
	}
	
	@ApiOperation(value = "单记录查询")
	@GetMapping("/user/{id}")
	public Result<User> getUserById(@PathVariable(name="id") String id) {				
		return new Result<>(userService.getById(id));
	}
	
	@ApiOperation(value = "修改")
	@PutMapping("/user/{id}")
	public Result<?> update(@PathVariable(name="id") String id,@Valid @RequestBody User user) {
	 user.setId(id);
	 user.setModifiedTime(new Date());
	 userService.updateById(user);
	 return Result.SUCCESS;
	}
	
	@ApiOperation(value = "删除")
	@DeleteMapping("/user/{id}")
	public Result<?> delete(@PathVariable(name="id") String id) {
		userService.delete(id);
		return Result.SUCCESS;
	}
	
	@ApiOperation(value = "新增")
	@PostMapping("/user")
	public Result<?> insert(@Valid @RequestBody User user) {
		
		user.setIsDeleted(0);
		user.setCreatedTime(new Date());
		userService.insert(user);
		return Result.SUCCESS;
	}

}
