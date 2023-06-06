package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        if (!sentence.isEmpty()) {
            String[] words = sentence.split("([\\s,\\.]+)");

            for (String word : words) {
                Integer temp = hashMap.get(word.toLowerCase());

                if (temp == null) {
                    hashMap.put(word.toLowerCase(), 1);
                } else {
                    hashMap.put(word.toLowerCase(), ++temp);
                }
            }
        }

        return hashMap;
    }
}
