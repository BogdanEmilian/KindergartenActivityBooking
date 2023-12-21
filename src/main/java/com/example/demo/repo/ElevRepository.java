package com.example.demo.repo;

import com.example.demo.entity.Elev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElevRepository extends JpaRepository<Elev, Integer> {

}
