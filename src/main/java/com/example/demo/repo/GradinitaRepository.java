package com.example.demo.repo;

import com.example.demo.entity.Gradinita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradinitaRepository extends JpaRepository<Gradinita, Integer> {

}
