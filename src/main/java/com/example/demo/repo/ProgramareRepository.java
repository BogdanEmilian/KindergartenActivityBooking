package com.example.demo.repo;

import com.example.demo.entity.Programare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramareRepository extends JpaRepository<Programare, Integer> {

}
