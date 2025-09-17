package com.demo.demo.hotdogs;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HotdogService {

    List<Hotdog> prepareHotdogs() {
        System.out.println("Preparing hotdogs...");
        return List.of(new Hotdog(12, List.of("Ketchup", "Mustard"), false, "Ballpark"),
                new Hotdog(10, List.of("Relish", "Onions"), true, "Nathans"));
    }
}
