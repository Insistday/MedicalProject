package cn.ekgc.witmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b></b>
 *
 * @author Administrator
 * @date 2022/8/25 0025
 */
@EnableDiscoveryClient
@SpringBootApplication

public class ParentStarter {
	public static void main(String[] args) {
		SpringApplication.run(ParentStarter.class, args);
	}
}
