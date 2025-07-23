package data.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {

	@Id
	private Integer orderItem;

	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false)
	private Order orderId;

	@OneToOne()
	@JoinColumn(name = "item_id", referencedColumnName = "itemId")
	private Item item;

	@Column(name = "quantity", nullable = false)
	private Integer quantity;

	private String notes;


	public Integer getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(Integer orderItem) {
		this.orderItem = orderItem;
	}

	public Order getOrder() {
		return orderId;
	}

	public void setOrder(Order order) {
		this.orderId = order;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Order getOrderId() {
		return orderId;
	}

	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}