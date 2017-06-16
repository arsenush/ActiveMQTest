package com.example.storage;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Storage {
    private static List<String> data = new ArrayList<>();

    public static List<String> getData() {
        return data;
    }

    public static void add(String incomeData) {
        data.add(incomeData);
    }
}
