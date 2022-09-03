package com.example.chapter2.controller;

import com.example.chapter2.domain.Cart;
import com.example.chapter2.repository.CartRepository;
import com.example.chapter2.repository.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Mono;


@RequiredArgsConstructor
@Controller
public class HomeController {

    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;

    @GetMapping
    public Mono<Rendering> home(){
        return Mono.just(Rendering.view("home.html")
                                 .modelAttribute("items", this.itemRepository.findAll())
                                 .modelAttribute("cart", this.cartRepository.findById("My Cart")
                                         .defaultIfEmpty(new Cart("My Cart"))).build());


    }
}
