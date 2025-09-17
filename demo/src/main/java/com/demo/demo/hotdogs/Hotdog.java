package com.demo.demo.hotdogs;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hotdog {
    private int size;
    private List<String> toppings;
    private boolean isVegetarian;
    private String creator;
}
