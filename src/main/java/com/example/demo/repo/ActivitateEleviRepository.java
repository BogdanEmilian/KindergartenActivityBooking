package com.example.demo.repo;

import com.example.demo.entity.ActivitateElevi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitateEleviRepository extends JpaRepository<ActivitateElevi, Integer> {

}
