package data.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_item")

public class OrderItem {


    //    Order_Item_ID INT PRIMARY KEY AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_Item_ID")
    private Integer orderItemId;

//    Order_ID INT NOT NULL,
    @Column(name = "order_id", nullable = false)
    private Integer orderId;

//    Item_ID INT NOT NULL,
    @Column(name = "item_id", nullable = false)
    private Integer itemId;

//    Quantity INT NOT NULL DEFAULT 1,
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

//    Price DECIMAL(9 , 2 ) NOT NULL DEFAULT 0,
    @Column(name = "price", precision = 9, scale = 2, nullable = false)
    private Double price;

//    CONSTRAINT fk_OrderItem_OrderID_id FOREIGN KEY (Order_ID)
//    REFERENCES `Order` (Order_ID),
//    CONSTRAINT fk_OrderItem_Item_ID_id FOREIGN KEY (Item_ID)
//    REFERENCES Item (Item_ID)


    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
