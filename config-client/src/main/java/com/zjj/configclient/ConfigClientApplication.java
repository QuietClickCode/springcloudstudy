package com.zjj.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigClientApplication.class, args);
	}
	//在centos 阿里云上会报错,暂时注释掉
	/*@Value("${foo}")
	String foo;*/
	@RequestMapping(value = "/hi")
	public String hi(){
		/*return foo;*/
		return "test";
	}
}
