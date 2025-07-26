package com.assessment.summative.data.repository;
import com.assessment.summative.data.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByItemCategoryId(Integer itemCategoryId);
}
