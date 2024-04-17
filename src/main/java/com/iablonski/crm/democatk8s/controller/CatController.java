package com.iablonski.crm.democatk8s.controller;

import com.iablonski.crm.democatk8s.dto.CatDto;
import com.iablonski.crm.democatk8s.entity.Cat;
import com.iablonski.crm.democatk8s.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cats")
public class CatController {

    private final CatService catService;

    @PostMapping("/new")
    public Cat save(@RequestBody CatDto catDto){
        return catService.create(catDto);
    }

    @GetMapping("/all")
    public List<Cat> getAllCats(){
        return catService.getAll();
    }
}
