package data.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "customer")

public class Customer {

	public Customer() {
	}

	// CUSTOMER
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
	@Column(name = "street_address", nullable = false)
	private String streetAddress;

//	city varchar(50) null,
	@Column(name = "city", nullable = false)
	private String city;

//	state char(2) null,
	@Column(name = "state", nullable = false)
	private String state;

//	zip_code varchar(5) null,
	@Column(name = "zip_code", nullable = false)
	private String zipCode;

//	email_address varchar(100) not null,
	@Column(name = "email_address", nullable = false)
	private String emailAddress;

//	phone varchar(20) not null,
	@Column(name = "phone", nullable = false)
	private String phone;

//	date_added date not null,
	@Column(name = "date_added", nullable = false)
	private String dateAdded;

//	reward_points int not null
	@Column(name = "reward_points", nullable = false)
	private int rewardPoints;


	public Customer(UUID customerId, String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String emailAddress, String phone, String dateAdded, int rewardPoints) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.emailAddress = emailAddress;
	}

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

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
