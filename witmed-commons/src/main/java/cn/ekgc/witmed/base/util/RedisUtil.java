package cn.ekgc.witmed.base.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b>操作工具类</b>
 *
 * @author Administrator
 * @date 2022/8/26 0026
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>根据key 将对应的value 存储到 Redis 中</b>
	 * @param key
	 * @param value
	 * @param expireSec
	 * @return
	 * @throws Exception
	 */
	public Boolean saveToRedis(String key,Object value,Integer expireSec) throws Exception{
		/**
		 * 由于 String RedisTemolate 在存储value时 只能是 String 类型
		 * 因此需要将 Object 转换为 String 类型 可以将 Object 对应的对象
		 * 变为String 类型的JSON 进行存储
		 * 想要变为JSON则需要使用 JsonMapper对象实现
		 */
		//创建 JsonMapper 对象
		JsonMapper jsonMapper = new JsonMapper();
		//通过JsonMapper 将Object 类型的 value变为 JSON 格式的String
		String valueJSON = jsonMapper.writeValueAsString(value);
		//将改成数据存储到Redis中
		redisTemplate.opsForValue().set(key,valueJSON);
		//判断是否给定了时间
		if(expireSec != null && expireSec > 0) {
			//设置了过期时间 那么进行设置存储到 Redis 的时长
			redisTemplate.expire(key,expireSec, TimeUnit.SECONDS);
		}
		return true;
	}

	/**
	 * <b>根据 key 获得Redis 中所村塾的数据</b>
	 * @param key
	 * @param valueType
	 * @return
	 * @throws Exception
	 */
	public Object getFromRedis(String key,Class valueType) throws Exception{
		//根据 kye 从 Redis 中获得相应的数据
		String valeJSON = redisTemplate.opsForValue().get(key);
		//判断是否能够获取到相应的数据
		if(valeJSON != null && !"".equals(valeJSON.trim())) {
			//需要将JSON格式的value根据所提供的类型变为相应的对象
			//创建JsonMapper对象
			JsonMapper jsonMapper = new JsonMapper();
			return jsonMapper.readValue(valeJSON, valueType);
		} else {
			//未获取到数据
			return null;
		}
	}

	/**
	 * <b>将对应的数据从 Redis 中删除</b>
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public Boolean deleteFormRedis(String key) throws Exception{
		redisTemplate.delete(key);
		return true;
	}

}
