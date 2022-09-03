package com.example.chapter2.repository;

import com.example.chapter2.domain.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RepositoryDatabaseLoader {
    @Bean
    CommandLineRunner initialize(BlockingItemRepository repository){
        return args -> {
            repository.save(new Item("Alf alarm clock", 19.99));
            repository.save(new Item("Smurf Tv tray", 24.99));
        };
    }
}
