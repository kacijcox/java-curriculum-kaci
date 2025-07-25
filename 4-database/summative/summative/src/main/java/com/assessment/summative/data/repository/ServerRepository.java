package com.assessment.summative.data.repository;

import com.assessment.summative.data.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Integer> {
}
