package com.ssafy.mvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.ssafy.mvc.model.dao")
public class SpringDay08MyBatisSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDay08MyBatisSpringApplication.class, args);

	}

}
