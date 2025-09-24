package com.albs.inerview.patterns;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalRegistryHolder {

    private final Map<String, String> values = new ConcurrentHashMap<>();

    private GlobalRegistryHolder() {
    }

    private static class Holder {
        private static final GlobalRegistryHolder INSTANCE = new GlobalRegistryHolder();
    }

    public static GlobalRegistryHolder getInstance() {
        return Holder.INSTANCE;
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


