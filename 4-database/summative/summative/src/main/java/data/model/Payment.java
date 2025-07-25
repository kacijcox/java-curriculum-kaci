package data.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "payment")


public class Payment {
    //    Payment_ID INT PRIMARY KEY AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Integer paymentId;

//    Payment_Type_ID INT NOT NULL,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_type_id", referencedColumnName = "payment_type_id")
    private PaymentType paymentType;

//    Order_ID INT NOT NULL,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

//    Amount DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "amount", precision = 9, scale = 2, nullable = false)
    private BigDecimal amount;

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

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
