package com.albs.inerview.patterns;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class GlobalRegistryDcl {

    private static final AtomicReference<GlobalRegistryDcl> INSTANCE = new AtomicReference<>();

    private final Map<String, String> values = new ConcurrentHashMap<>();

    private GlobalRegistryDcl() {
    }

    public static GlobalRegistryDcl getInstance() {
        GlobalRegistryDcl local = INSTANCE.get();
        if (local == null) {
            GlobalRegistryDcl created = new GlobalRegistryDcl();
            if (INSTANCE.compareAndSet(null, created)) {
                local = created;
            } else {
                local = INSTANCE.get();
            }
        }
        return local;
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


