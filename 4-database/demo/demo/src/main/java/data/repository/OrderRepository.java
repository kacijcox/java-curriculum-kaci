package data.repository;
import data.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    // findAll()
    // SELECT
        // order_id
        // customer_id
        // order_status_id
        // notes
        // order_item_id
        // name -- order_status
        // parent_order_status
    // FROM `order`
    // JOIN order_status USING(order_status_id);
    // we are also joining order_item and item tables


}

// add new orders
// print out items
// retrieve items
