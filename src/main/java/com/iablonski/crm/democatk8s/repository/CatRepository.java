package com.iablonski.crm.democatk8s.repository;

import com.iablonski.crm.democatk8s.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
