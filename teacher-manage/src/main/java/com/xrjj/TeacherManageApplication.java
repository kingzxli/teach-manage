package com.xrjj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xrjj.mapper")
@SpringBootApplication
public class TeacherManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherManageApplication.class, args);
	}

}
