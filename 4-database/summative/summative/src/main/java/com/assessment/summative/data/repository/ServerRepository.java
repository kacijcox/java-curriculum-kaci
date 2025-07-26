package com.assessment.summative.data.repository;

import com.assessment.summative.data.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServerRepository extends JpaRepository<Server, Integer> {

    List<Server> findByServerId(Integer serverId);
    List<Server> findByTermDateIsNull();
}
