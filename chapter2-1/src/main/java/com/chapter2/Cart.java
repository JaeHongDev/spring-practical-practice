package com.chapter2;


import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@NoArgsConstructor
public class Cart {
    private @Id String id;
    private List<CartItem> cartItems;

    public Cart(String id){
        this(id, new ArrayList<>());
    }
    public Cart(String id, List<CartItem> cartItems){
        this.id = id;
        this.cartItems = cartItems;
    }


}
