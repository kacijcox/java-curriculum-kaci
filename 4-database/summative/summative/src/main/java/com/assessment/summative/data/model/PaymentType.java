package com.assessment.summative.data.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "payment_type")

public class PaymentType {
    //    Payment_Type_ID INT PRIMARY KEY AUTO_INCREMENT,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_type_id")
    private Integer paymentTypeId;

    @OneToMany(mappedBy = "paymentType")
    private List<Payment> payments;

//    Payment_Type_Name VARCHAR(25) NOT NULL
    @Column(name = "payment_type_name", nullable = false)
    private String paymentTypeName;

    public Integer getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Integer paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }
}
