package com.news.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.news.dao.RedisTemplateDao;

@Service("redisTemplateDao")
public class RedisTemplateDaoImpl<K extends Serializable, V extends Serializable> implements RedisTemplateDao {

	@Resource
	RedisTemplate<K, V> redisTemplate;

	@Override
	public boolean add(Serializable key, Serializable value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Serializable key, Serializable value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Serializable key, Serializable value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Serializable find(Serializable key) {
		// TODO Auto-generated method stub
		return null;
	}

}
