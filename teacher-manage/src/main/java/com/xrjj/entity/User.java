package com.xrjj.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户表")
@Data
@TableName("xrjj_user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	@TableId
	@ApiModelProperty(value = "Id")
	private String id;
	
	@NotBlank(message = "姓名不能为空")
	@Length(max = 11, message = "姓名输入超出最大长度(11)")
	@ApiModelProperty(value = "姓名")
	private String name;
	
	@NotBlank(message = "电话不能为空")
	@Length(max = 20, message = "电话输入超出最大长度(20)")
	@ApiModelProperty(value = "电话")
	private String phone;
	
	@ApiModelProperty(value = "微信号")
	@NotBlank(message = "openId不能为空")
	private String openId;
	
	@Length(max = 32, message = "身份证号码输入超出最大长度(32)")
	@ApiModelProperty(value = "身份证号码")
	private String idCard;
	
	@Length(max = 2, message = "性别输入超出最大长度(2)")
	@ApiModelProperty(value = "性别")
	private String sex;
	
	@Length(max = 255, message = "身份证正面输入超出最大长度(255)")
	@ApiModelProperty(value = "身份证正面")
	private String idCardPositive;
	
	@Length(max = 255, message = "身份证背面输入超出最大长度(255)")
	@ApiModelProperty(value = "身份证背面")
	private String idCardBack;
	
	@Length(max = 255, message = "毕业证输入超出最大长度(255)")
	@ApiModelProperty(value = "毕业证")
	private String graduationCard;
	
	@Length(max = 255, message = "教师资格证输入超出最大长度(255)")
	@ApiModelProperty(value = "教师资格证")
	private String teacherCertificate;
	
	@Length(max = 255, message = "头像输入超出最大长度(255)")
	@ApiModelProperty(value = "头像")
	private String headImage;
	
	@ApiModelProperty(value = "教龄",example = "1")
	private Integer teachAge;
	
	@Length(max = 255, message = "主教/辅教输入超出最大长度(255)")
	@ApiModelProperty(value = "主教/辅教")
	private String teachSubjects;
	
	@Length(max = 255, message = "毕业学校输入超出最大长度(255)")
	@ApiModelProperty(value = "毕业学校")
	private String school;
	
	@ApiModelProperty(value = "学校开始时间")
	private Date schoolStartTime;
	
	@ApiModelProperty(value = "学校结束时间")
	private Date schoolEndTime;
	
	@Length(max = 20, message = "学历输入超出最大长度(20)")
	@ApiModelProperty(value = "学历")
	private String recordFormalSchooling;
	
	@Length(max = 20, message = "专业输入超出最大长度(20)")
	@ApiModelProperty(value = "专业")
	private String professional;
	
	@Length(max = 20, message = "教师职称输入超出最大长度(20)")
	@ApiModelProperty(value = "教师职称")
	private String teachersTitle;
	
	@Length(max = 255, message = "教师职称证书输入超出最大长度(255)")
	@ApiModelProperty(value = "教师职称证书")
	private String teachersTitleImage;
	
	@Length(max = 500, message = "荣誉输入超出最大长度(500)")
	@ApiModelProperty(value = "荣誉")
	private String honor;
	
	@Length(max = 1000, message = "教学经历输入超出最大长度(1000)")
	@ApiModelProperty(value = "教学经历")
	private String teachingExperience;
	
	@Length(max = 1000, message = "成功案例输入超出最大长度(1000)")
	@ApiModelProperty(value = "成功案例")
	private String successfulCases;
	
	@Length(max = 64, message = "个人标签输入超出最大长度(64)")
	@ApiModelProperty(value = "个人标签")
	private String tag;
	
	@Length(max = 500, message = "个人照片输入超出最大长度(500)")
	@ApiModelProperty(value = "个人照片")
	private String photo;
	
	@Length(max = 255, message = "授课区域输入超出最大长度(255)")
	@ApiModelProperty(value = "授课区域")
	private String teachArea;
	
	@ApiModelProperty(value = "是否管理员",example = "1")
	private Integer isAdmin;
	
	@ApiModelProperty(value = "是否删除(1:是，0:否)",example = "1")
	@TableLogic
	private Integer isDeleted;
	
	@ApiModelProperty(value = "创建人")
	private String createdUser;
	
	@ApiModelProperty(value = "创建时间")
	private Date createdTime;
	
	@ApiModelProperty(value = "修改人")
	private String modifiedUser;
	
	@ApiModelProperty(value = "修改时间")
	private Date modifiedTime;
	
	
}
