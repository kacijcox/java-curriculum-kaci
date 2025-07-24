package data.repository;
import data.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    List<Customer> findByCity(String city);

    @Query(value = "SELECT customer_id, first_name, last_name, street_address, city, state, zip_code, email_address, phone, date_added, reward_points FROM customer JOIN `order` USING (customer_id) JOIN order_status USING (order_status_id) WHERE order_status.name = 'Ready for pickup'", nativeQuery = true)
    List<Customer> getReadyForPickup();

    @Query(value = "SELECT customer_id, first_name, last_name, street_address, city, state, zip_code, email_address, phone, date_added, reward_points FROM customer JOIN `order` USING (customer_id) JOIN order_status USING (order_status_id) WHERE order_status.order_status_id = :statusId", nativeQuery = true)
    List<Customer> getByOrderStatus(int statusId);
}
