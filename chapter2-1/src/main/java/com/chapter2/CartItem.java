package com.chapter2;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class CartItem {
    private Item item;
    private int quantity;

    public CartItem(Item item){
        this.item = item;
        this.quantity = 1;
    }

    public void increment() {
        this.quantity++;

    }
}
