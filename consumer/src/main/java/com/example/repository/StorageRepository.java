package com.example.repository;

import java.util.List;

public interface StorageRepository {
    List<String> getData();
    void addData(String data);
}
