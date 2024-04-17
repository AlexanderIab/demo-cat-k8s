package com.iablonski.crm.democatk8s.service;

import com.iablonski.crm.democatk8s.dto.CatDto;
import com.iablonski.crm.democatk8s.entity.Cat;

import java.util.List;

public interface CatService {
    Cat create(CatDto catDto);
    List<Cat> getAll();
}
