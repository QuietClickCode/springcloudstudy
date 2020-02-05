2020年2月1日22:40:11
	 进入docker
	 docker exec -it 775c7c9ee1e1 /bin/sh  
	 
	 mvn clean package dockerfile:build
	 
	 docker run -idt -p 8761:8761 --name eureka-server eureka-server:0.0.1-SNAPSHOT
	 docker run -idt -p 8888:8888 --name config-server config-server:0.0.1-SNAPSHOT
	 docker run -idt -p 8881:8881 --name config-client config-client:0.0.1-SNAPSHOT
	 docker run -idt -p 8765:8765 --name service-feign service-feign:0.0.1-SNAPSHOT
	 docker run -idt -p 8763:8763 --name service-hi service-hi:0.0.1-SNAPSHOT
	 docker run -idt -p 8769:8769 --name service-zuul service-zuul:0.0.1-SNAPSHOT
	 docker run -idt -p 8764:8764 --name service-ribbon service-ribbon:0.0.1-SNAPSHOT

	 <!--Docker maven plugin-->
			<plugin>
				<groupId>com.spotify</groupId>
				<artifactId>dockerfile-maven-plugin</artifactId>
				<version>1.4.10</version>
				<configuration>
					<repository>${project.artifactId}</repository>
					<contextDirectory>./</contextDirectory>
					<tag>${project.version}</tag>
					<buildArgs>
						<JAR_FILE>target/${project.build.finalName}.jar</JAR_FILE>
					</buildArgs>
				</configuration>
			</plugin>
			
spring cloud + docker部署成功