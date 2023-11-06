package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class PhoneBook {

    private HashMap<String, String> phoneBook = new HashMap<>();

    public int add(String name, String number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    public String findByNumber(String number) {
        return phoneBook
                .entrySet()
                .stream()
                .filter(entry -> number.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().get();
    }

    public String findByName(String name) {
        return phoneBook.get(name);
    }

    public String printAllNames() {
        String result = null;

        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            i++;
            if (i != phoneBook.size()) {
                stringBuilder.append(entry.getKey() + ", ");
            } else {
                stringBuilder.append(entry.getKey());
            }
        }
        result = stringBuilder.toString();
        System.out.println(result);
        return result;
    }
}
