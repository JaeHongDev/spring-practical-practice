package com.example.chapter2b;

import com.fasterxml.jackson.databind.DatabindException;
import com.mongodb.internal.thread.DaemonThreadFactory;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.awt.*;
import java.util.Date;



@Setter
@Getter
@Data
public class Item {
    private @Id String id;
    private String name;
    private String description;
    private double price;
    private String distributorRegion;
    private Date releaseDate;
    private int availableUnits;
    private Point location;
    private Boolean active;

    private Item() {}
    public Item(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
