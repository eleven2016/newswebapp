package com.news.dao;

public interface StringRedisTemplateDao {
	
	public boolean add(String key, String value);

	public boolean remove(String key, String value);

	public boolean update(String key, String value);

	public String find(String key);
}
