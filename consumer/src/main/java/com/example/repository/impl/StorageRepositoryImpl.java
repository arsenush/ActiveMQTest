package com.example.repository.impl;

import com.example.repository.StorageRepository;
import com.example.storage.Storage;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Arsenush on 03.04.2017.
 */

@Repository
public class StorageRepositoryImpl implements StorageRepository {
    @Override
    public List<String> getData() {
        return Storage.getData();
    }

    @Override
    public void addData(String data) {
        Storage.add(data);
    }
}
