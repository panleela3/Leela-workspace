package com.java.lambda;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {

    public static void main(String[] args) {

        // Creating a HashMap
        Map<String, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put("John", "Developer");
        map.put("Alice", "Designer");
        map.put("Bob", "Manager");

        // Overwriting a value (same key, different value)
        map.put("Alice", "Senior Designer");

        // Print all key-value pairs
        System.out.println("HashMap contents:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Demonstrating collision handling
        // Use same hashcode keys
        System.out.println("\nHash codes:");
        System.out.println("John: " + "John".hashCode());
        System.out.println("Alice: " + "Alice".hashCode());
        System.out.println("Bob: " + "Bob".hashCode());

        // Accessing a value
        System.out.println("\nValue for 'Alice': " + map.get("Alice"));

        // Removing a key
        map.remove("Bob");
        System.out.println("\nAfter removing Bob: " + map);
    }
}
