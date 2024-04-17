package com.iablonski.crm.democatk8s.service.impl;

import com.iablonski.crm.democatk8s.dto.CatDto;
import com.iablonski.crm.democatk8s.entity.Cat;
import com.iablonski.crm.democatk8s.repository.CatRepository;
import com.iablonski.crm.democatk8s.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatServiceImpl implements CatService {


    private  final CatRepository catRepository;

    @Override
    public Cat create(CatDto catDto) {
        Cat cat = new Cat();
        cat.setName(catDto.name());
        cat.setDob(catDto.dob());
        return catRepository.save(cat);
    }

    @Override
    public List<Cat> getAll() {
        return catRepository.findAll();
    }
}
