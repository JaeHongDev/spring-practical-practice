package com.example.chapter2.repository;

import com.example.chapter2.domain.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@Component
public class TemplateDatabaseLoader {

    @Bean
    CommandLineRunner initialize(MongoOperations mongo){
        return args ->{
            mongo.save(new Item("Alf alarm clock",19.22));
            mongo.save(new Item("Smurf Tv tray", 24.99));
        };
    }
}
