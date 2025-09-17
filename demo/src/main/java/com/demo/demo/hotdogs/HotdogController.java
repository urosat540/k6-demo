package com.demo.demo.hotdogs;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; // Add this import

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HotdogController {
    
    private final HotdogService hotdogService;

    @GetMapping("/prepareHotdogs")
    public List<Hotdog> prepareHotdogs() {
        return hotdogService.prepareHotdogs();
    }
}
