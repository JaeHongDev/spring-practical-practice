package com.chapter2;


import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart,String> {
}
