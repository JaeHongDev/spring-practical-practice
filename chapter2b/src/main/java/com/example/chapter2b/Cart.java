package com.example.chapter2b;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private @Id String id;
    private List<CartItem> cartItems;


    public Cart(String cartId) {
        this.id = cartId;
    }
}
