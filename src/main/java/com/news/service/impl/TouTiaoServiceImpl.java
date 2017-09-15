package com.news.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.news.dao.RedisTemplateDao;
import com.news.service.TouTiaoService;

@Service("touTiaoService")
public class TouTiaoServiceImpl implements TouTiaoService {

	private static Logger logger = Logger.getLogger(TouTiaoServiceImpl.class);

	@Resource
	RedisTemplateDao redisTemplateDao;
	@Override
	public void test() {
		logger.info("测试redis");
		redisTemplateDao.add("key", "value");
	}

}
