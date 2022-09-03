package com.example.chapter2.repository;

import com.example.chapter2.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface BlockingItemRepository extends CrudRepository<Item,String> {
}
