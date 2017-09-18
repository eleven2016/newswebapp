package com.news.dao.impl;

import javax.annotation.Resource;

import org.springframework.data.redis.core.StringRedisTemplate;

import com.news.dao.StringRedisTemplateDao;

public class StringRedisTemplateDaoImpl implements StringRedisTemplateDao {
	@Resource
	StringRedisTemplate stringRedisTemplate;

	@Override
	public boolean add(String key, String value) {
		return false;
	}

	@Override
	public boolean remove(String key, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String key, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String find(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
