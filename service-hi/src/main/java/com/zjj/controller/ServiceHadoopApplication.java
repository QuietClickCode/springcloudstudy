package com.zjj.controller;

import com.zjj.service.UploadFilServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@EnableEurekaClient
@RestController
@Slf4j
public class ServiceHadoopApplication {
	@Value("${server.port}")
	String port;

	@Autowired
	private UploadFilServiceImpl uploadFileServiceImpl;

	@RequestMapping("/uploadtohadoop")
	public String uploadToHadoop(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws Exception {
		//System.out.println("ServiceHadoopApplication");
		log.info("ServiceHadoopApplication");
		return uploadFileServiceImpl.uploadlocal(file);
		// HdfsUtil.CopyToLocal("/hdfs/java/api/1.txt", "./2.txt");
	}

}
