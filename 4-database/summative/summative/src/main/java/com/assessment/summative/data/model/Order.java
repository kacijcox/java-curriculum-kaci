package com.assessment.summative.data.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "`order`")

public class Order {

    //    Order_ID INT PRIMARY KEY AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    //    Server_ID INT NOT NULL,
    @Column(name = "server_id", nullable = false)
    private Integer serverId;

    //    Order_Date DATETIME NOT NULL,
    @Column(name ="order_date", nullable = false)
    private LocalDateTime orderDate;

//    Sub_Total DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "sub_total", precision = 9, scale = 2, nullable = false)
    private BigDecimal subTotal;

//    Tax DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "tax", precision = 9, scale = 2, nullable = false)
    private BigDecimal tax;

//    Tip DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "tip", precision = 9, scale = 2, nullable = false)
    private BigDecimal tip;

//    Total DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "total", precision = 9, scale = 2, nullable = false)
    private BigDecimal total;

//    CONSTRAINT fk_item_OrderServer_id FOREIGN KEY (Server_ID)
//    REFERENCES Server (Server_ID)


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTip() {
        return tip;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
