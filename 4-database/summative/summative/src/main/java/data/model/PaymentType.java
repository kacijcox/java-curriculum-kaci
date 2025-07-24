package data.model;

import jakarta.persistence.*;

@Entity
@Table(name = "payment_type")

public class PaymentType {
    //    Payment_Type_ID INT PRIMARY KEY AUTO_INCREMENT,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_type_id")
    private Integer paymentTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_type_id", referencedColumnName = "payment_type_id")
    private Payment payment;

//    Payment_Type_Name VARCHAR(25) NOT NULL
    @Column(name = "payment_type_name", nullable = false)
    private String paymentTypeName;

    public Integer getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Integer paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }
}
