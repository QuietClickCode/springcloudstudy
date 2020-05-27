package com.zjj.servicehi;

import com.zjj.hadoop.utils.HdfsUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
public class ServiceHadoopApplication {
	@Value("${server.port}")
	String port;

	@RequestMapping("/uploadtohadoop")
	public String uploadToHadoop() throws Exception {
		System.out.println("ServiceHadoopApplication");
		HdfsUtil.CopyToLocal("/hdfs/java/api/1.txt", "./2.txt");
		return "hi ,I am hadoop";
	}

}
