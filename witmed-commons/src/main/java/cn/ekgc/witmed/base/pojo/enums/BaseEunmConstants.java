package cn.ekgc.witmed.base.pojo.enums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * <b></b>
 *
 * @author Administrator
 * @date 2022/8/26 0026
 */
class BaseEunmConstants {
	//创建日志对象
	private static Logger logger = LoggerFactory.getLogger(BaseEunmConstants.class);
	private static Properties props = new Properties();
	static {
		try {
			props.load(BaseEunmConstants.class.getClassLoader().getResourceAsStream("props/base/enums.properties"));
		} catch (IOException e) {
			logger.error(e.getMessage() + " : " + new Date(),e);
			throw new RuntimeException(e);
		}
	}
	/**
	 * <b>系统状态：启用状态</b>
	 */
	static final String STATUS_ENABLE = props.getProperty("enum.status.enable");
	/**
	 * <b>系统状态：禁用状态</b>
	 */
	static final String STATUS_DISABLE = props.getProperty("enum.status.disable");
	/**
	 * <b>系统响应编码：系统业务处理和响应成功</b>
	 */
	static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("enum.response.success"));
	/**
	 * <b>系统响应编码：用户未进行系统认证</b>
	 */
	static final Integer RESPONSE_UNAUTH = Integer.parseInt(props.getProperty("enum.response.unauth"));

	/**
	 * <b>系统响应编码：系统业务处理错误</b>
	 */
	static final Integer RESPONSE_FAILURE = Integer.parseInt(props.getProperty("enum.response.failure"));

	/**
	 * <b>系统响应编码：系统响应异常</b>
	 */
	static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("enum.response.exception"));




}
