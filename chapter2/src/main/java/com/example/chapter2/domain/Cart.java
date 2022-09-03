package com.example.chapter2.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Cart {
    private @Id String id;
    private List<CartItem> cartItems;

    public Cart(String id){
        this.id = id;
    }
}
