package com.example.demo.config;
/*
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class FirestoreConfig {

    @Value("${firebase.config.path}")
    private String firebaseConfigPath;

    @Value("${firebase.project.id}")
    private String firebaseProjectId;

    @Bean
    public Datastore datastore() throws IOException {
        InputStream serviceAccount = new ClassPathResource(firebaseConfigPath).getInputStream();

        DatastoreOptions datastoreOptions =
                DatastoreOptions.newBuilder()
                        .setProjectId(firebaseProjectId)
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .build();

        return datastoreOptions.getService();
    }
}

 */