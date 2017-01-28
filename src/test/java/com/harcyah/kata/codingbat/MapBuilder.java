package com.harcyah.kata.codingbat;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder {

	public static <K, V> Map<K, V> build() {
		Map<K, V> map = new HashMap<>();
		return map;
	}

	public static <K, V> Map<K, V> build(K key0, V value0) {
		Map<K, V> map = new HashMap<>();
		map.put(key0, value0);
		return map;
	}

	public static <K, V> Map<K, V> build(K key0, V value0, K key1, V value1) {
		Map<K, V> map = new HashMap<>();
		map.put(key0, value0);
		map.put(key1, value1);
		return map;
	}

	public static <K, V> Map<K, V> build(K key0, V value0, K key1, V value1, K key2, V value2) {
		Map<K, V> map = new HashMap<>();
		map.put(key0, value0);
		map.put(key1, value1);
		map.put(key2, value2);
		return map;
	}

	public static <K, V> Map<K, V> build(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3) {
		Map<K, V> map = new HashMap<>();
		map.put(key0, value0);
		map.put(key1, value1);
		map.put(key2, value2);
		map.put(key3, value3);
		return map;
	}

	public static <K, V> Map<K, V> build(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4) {
		Map<K, V> map = new HashMap<>();
		map.put(key0, value0);
		map.put(key1, value1);
		map.put(key2, value2);
		map.put(key3, value3);
		map.put(key4, value4);
		return map;
	}

}
