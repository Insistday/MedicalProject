package cn.ekgc.witmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b>智慧医疗信息平台-电子病历功能 provider 启动类</b>
 *
 * @author Administrator
 * @date 2022/8/25 0025
 */
@EnableDiscoveryClient
@MapperScan("cn.ekgc.witmed.emr.*.mapper")
@SpringBootApplication
public class EmrProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(EmrProviderStarter.class, args);
	}
}
