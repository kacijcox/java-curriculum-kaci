package com.assessment.summative.data.repository;

import com.assessment.summative.data.model.Item;
import com.assessment.summative.data.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByOrderDate(LocalDateTime orderDate);
    List<Order> findByServerId(Integer serverId);
}
