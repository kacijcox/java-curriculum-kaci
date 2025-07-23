package data.model;

import jakarta.persistence.*;

@Entity
@Table(name = "login")

public class Login {
	public Login() {}

	@Id
//	customer_id char(36) primary key,
	@Column(name = "customer_id", nullable = false)
	private String customerId;

//	user_name varchar(100) not null,
	@Column(name = "user_name", nullable = false)
	private String userName;

//	password_hash text not null,
	@Column(name = "password_hash", nullable = false)
	private String passwordHash;


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
}
