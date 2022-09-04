package com.example.chapter2b;

import lombok.*;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    private Item item;
    private int  quantity;

    public CartItem(Item item){
        this.item = item;
        this.quantity = 1;
    }

    public void increment() {
        this.quantity++;
    }
}
