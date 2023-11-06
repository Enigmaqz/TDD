package org.example;

import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, String> phoneBook = new HashMap<>();
    public int add(String name, String number){
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    public String findByNumber (String number) {
        return null;
    }
}
