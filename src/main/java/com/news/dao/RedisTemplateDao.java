package com.news.dao;

import java.io.Serializable;

public interface RedisTemplateDao<K extends Serializable, V extends Serializable> {

	public boolean add(K key, V value);

	public boolean remove(K key, V value);

	public boolean update(K key, V value);

	public V find(K key);
}
