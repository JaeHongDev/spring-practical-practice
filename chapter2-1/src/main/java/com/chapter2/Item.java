package com.chapter2;


import lombok.*;
import org.springframework.data.annotation.Id;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Item {
    private @Id String id;
    private String name;
    private double price;

    public Item(String name, double price){
        this.name  = name;
        this.price = price;
    }
}
