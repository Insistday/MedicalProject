package cn.ekgc.witmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>智慧医疗信息平台-通用实体功能 consumer 启动类</b>
 *
 * @author Administrator
 * @date 2022/8/25 0025
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class DateCommonsStarter {
	public static void main(String[] args) {
		SpringApplication.run(DateCommonsStarter.class,args);
	}
}
