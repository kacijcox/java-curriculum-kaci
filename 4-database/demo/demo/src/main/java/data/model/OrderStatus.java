package data.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_status")

public class OrderStatus {

	public OrderStatus() {}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_status_id", nullable = false)
	private String orderStatusId;


//    `name` varchar(50) not null,
	@Column(name = "name", nullable = false)
	private String name;

	public OrderStatus(String orderStatusId, String name) {
		this.orderStatusId = orderStatusId;
		this.name = name;
	}

	public String getOrderStatusId() {
		return orderStatusId;
	}

	public void setOrderStatusId(String orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
