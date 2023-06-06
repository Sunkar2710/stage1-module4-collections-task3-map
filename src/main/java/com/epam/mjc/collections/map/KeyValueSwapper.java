package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> node : new LinkedHashMap<>(sourceMap).entrySet()) {
            if (result.containsKey(node.getKey())) continue;
            result.put(node.getValue(), node.getKey());
        }
        return result;
    }
}
