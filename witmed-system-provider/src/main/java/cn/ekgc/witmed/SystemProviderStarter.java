package cn.ekgc.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b>智慧医疗信息平台-系统功能 provider 启动类</b>
 *
 * @author Administrator
 * @date 2022/8/25 0025
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.ekgc.witmed.system.*.mapper")
public class SystemProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemProviderStarter.class, args);
	}
}
