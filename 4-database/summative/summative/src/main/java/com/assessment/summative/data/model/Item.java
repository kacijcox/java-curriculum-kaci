package com.assessment.summative.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Item")

public class Item {

    public Item() {}

    //    Item_ID INT PRIMARY KEY AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<OrderItem> orderItemId;

    @Column (name = "item_category_id", nullable = false)
    private Integer itemCategoryId;
//
//    // Item_Category_ID INT NOT NULL,

//    Item_Name VARCHAR(25) NOT NULL,
    @Column(name = "item_name", nullable = false)
    private String itemName;

//    Item_Description VARCHAR(255) NOT NULL,
    @Column(name = "item_description", nullable = false)
    private String itemDescription;

//    Start_Date DATE NOT NULL,
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

//    End_Date DATE NULL,
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

//    Unit_Price DECIMAL(7 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;
//    CONSTRAINT fk_item_ItemCategory_id FOREIGN KEY (Item_Category_ID)
//    REFERENCES Item_Category (Item_Category_ID)


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public List<OrderItem> getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(List<OrderItem> orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getItemCategoryId() {
        return itemCategoryId;
    }

    public void setItemCategoryId(Integer itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}

