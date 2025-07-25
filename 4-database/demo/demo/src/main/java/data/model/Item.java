package data.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "item")

public class Item {

	public Item() {}

	@Id
	@Column(name = "item_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemId;

	//  `name` varchar(50) not null,
	@Column(name = "name", nullable = false)
	private String name;

	//	`description` varchar(1024) not null,
	@Column(name = "description", nullable = false)
	private String description;

	//	price decimal(8,2) not null
	@Column(name = "price", precision = 8, scale = 2, nullable = false)
	private BigDecimal price;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "Item{" +
				"itemId=" + itemId +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", price=" + price +
				'}';
	}
}

