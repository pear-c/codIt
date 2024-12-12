package org.example;

import java.util.HashMap;

public class WordDictionary {
    private HashMap<String, String> dictionary = new HashMap<>();

    public void addWord(String key, String value) {
        dictionary.put(key, value);
    }

    public String find(String key) {
        for(String s : dictionary.keySet()) {
            if(s.equalsIgnoreCase(key)) {
                return dictionary.get(s);
            }
        }
        return null;
    }
}
