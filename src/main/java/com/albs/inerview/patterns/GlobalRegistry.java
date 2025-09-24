package com.albs.inerview.patterns;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalRegistry {

    private static final GlobalRegistry INSTANCE = new GlobalRegistry();

    private final Map<String, String> values = new ConcurrentHashMap<>();

    private GlobalRegistry() {
    }

    public static GlobalRegistry getInstance() {
        return INSTANCE;
    }

    public void set(String key, String value) {
        values.put(key, value);
    }

    public String get(String key) {
        return values.get(key);
    }

    public int size() {
        return values.size();
    }
}