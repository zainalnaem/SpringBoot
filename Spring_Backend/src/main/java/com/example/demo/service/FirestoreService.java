package com.example.demo.service;
/*
import com.google.cloud.datastore.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirestoreService {

    @Autowired
    private Datastore datastore;

    public void writeData(String kind, String name, String key, String value) {
        KeyFactory keyFactory = datastore.newKeyFactory().setKind(kind);
        Key entityKey = keyFactory.newKey(name);

        Entity entity = Entity.newBuilder(entityKey)
                .set(key, value)
                .build();

        datastore.put(entity);
    }
}

 */