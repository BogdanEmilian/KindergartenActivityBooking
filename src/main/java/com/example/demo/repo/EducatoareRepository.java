package com.example.demo.repo;

import com.example.demo.entity.Educatoare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducatoareRepository extends JpaRepository<Educatoare, Integer> {

}
