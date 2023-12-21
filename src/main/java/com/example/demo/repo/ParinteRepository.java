package com.example.demo.repo;

import com.example.demo.entity.Parinte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParinteRepository extends JpaRepository<Parinte, Integer> {

}
