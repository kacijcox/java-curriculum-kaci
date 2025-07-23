package data.model;

import jakarta.persistence.*;

@Entity
@Table(name = "payment_type")

public class PaymentType {
    //    Payment_Type_ID INT PRIMARY KEY AUTO_INCREMENT,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Payment_Type_ID")
    private Integer paymentTypeId;

//    Payment_Type_Name VARCHAR(25) NOT NULL
    @Column(name = "payment_type_name", nullable = false)
    private String paymentTypeName;
}
