package data.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "order")

public class Order {

    //    Order_ID INT PRIMARY KEY AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @OneToMany(mappedBy = "order_id", fetch = FetchType.LAZY)
    private List<OrderItem> orderItem;

    @OneToMany(mappedBy = "order_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Payment> payment;

//    Server_ID INT NOT NULL,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "server_id", referencedColumnName = "server_id")
    private Server server;


    //    Order_Date DATETIME NOT NULL,
    @Column(name ="order_date", nullable = false)
    private LocalDateTime orderDate;

//    Sub_Total DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "sub_total", precision = 9, scale = 2, nullable = false)
    private Double subTotal;

//    Tax DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "tax", precision = 9, scale = 2, nullable = false)
    private Double tax;

//    Tip DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "tip", precision = 9, scale = 2, nullable = false)
    private Double tip;

//    Total DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "total", precision = 9, scale = 2, nullable = false)
    private Double total;

//    CONSTRAINT fk_item_OrderServer_id FOREIGN KEY (Server_ID)
//    REFERENCES Server (Server_ID)


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTip() {
        return tip;
    }

    public void setTip(Double tip) {
        this.tip = tip;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
