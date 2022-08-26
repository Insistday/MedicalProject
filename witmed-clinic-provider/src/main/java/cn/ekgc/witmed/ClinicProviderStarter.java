package cn.ekgc.witmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <b>智慧医疗信息平台-门诊功能-Provider 启动类</b>
 *
 * @author Administrator
 * @date 2022/8/25 0025
 */
@mapperscan("cn.ekgc.witmed.clinic.*.mapper")
@EnableDiscoveryClient
@SpringBootApplication
class ClinicProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(ClinicProviderStarter.class, args);
	}
}
