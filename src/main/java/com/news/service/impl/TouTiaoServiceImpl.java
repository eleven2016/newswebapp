package com.news.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.news.service.TouTiaoService;

@Service("touTiaoService")
public class TouTiaoServiceImpl implements TouTiaoService {

	private static Logger logger = Logger.getLogger(TouTiaoServiceImpl.class);

	@Resource
	StringRedisTemplate stringRedisTemplate;

	@Override
	public void test() {
		logger.info("测试redis");
		stringRedisTemplate.opsForValue().set("test1", "测试的1");
		stringRedisTemplate.opsForValue().set("test2", "测试的2");
		logger.info(stringRedisTemplate.opsForValue().get("test1"));
		logger.info(stringRedisTemplate.opsForValue().get("test2"));
	}

}
