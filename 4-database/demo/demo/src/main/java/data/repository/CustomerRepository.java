package data.repository;
import data.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

    // customerRepository.findAll();
    // SELECT
        // customer_id,
        // last_name,
        // street_address,
        // user_name,
        // password_hash
    // FROM customer;
    // JOIN login USING(customer_id);

}
