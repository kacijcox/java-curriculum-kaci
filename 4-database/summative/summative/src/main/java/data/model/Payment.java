package data.model;


import jakarta.persistence.*;

@Entity
@Table(name = "payment")


public class Payment {
    //    Payment_ID INT PRIMARY KEY AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Payment_ID")
    private Integer paymentId;

//    Payment_Type_ID INT NOT NULL,
    @Column(name = "payment_type_id", nullable = false)
    private Integer paymentTypeId;

//    Order_ID INT NOT NULL,
    @Column(name = "order_id", nullable = false)
    private Integer orderId;

//    Amount DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "amount", precision = 9, scale = 2, nullable = false)
    private Double amount;

//    CONSTRAINT fk_Payment_PaymentTypeID_id FOREIGN KEY (Payment_Type_ID)
//    REFERENCES Payment_Type (Payment_Type_ID),
//    CONSTRAINT fk_Payment_OrderID_id FOREIGN KEY (Order_ID)
//    REFERENCES `Order` (Order_ID)


    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Integer paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
