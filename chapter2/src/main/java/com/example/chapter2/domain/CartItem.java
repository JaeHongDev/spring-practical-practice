package com.example.chapter2.domain;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class CartItem{
    private Item item;
    private int quantity;
}
