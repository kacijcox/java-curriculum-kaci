package data.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "customer")

public class Customer {

	public Customer() {
	}

//	customer_id char(36) primary key,
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID customerId;

//	first_name varchar(50) not null,
	@Column(name = "first_name", nullable = false)
	private String firstName;

//	last_name varchar(50) not null,
	@Column(name = "last_name", nullable = false)
	private String lastName;

//	street_address varchar(100) null,

//	city varchar(50) null,
//	state char(2) null,
//	zip_code varchar(5) null,
//	email_address varchar(100) not null,
//	phone varchar(20) not null,
//	date_added date not null,
//	reward_points int not null


	public UUID getCustomerId() {
		return customerId;
	}

	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
