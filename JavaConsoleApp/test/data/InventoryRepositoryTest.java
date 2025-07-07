package data;
import model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InventoryRepositoryTest {
	List<Product> testProducts;


	@BeforeEach
	public void setup() {
		testProducts = new ArrayList<>();

	}

	@Test
	public void InventoryRepository_add_productAdd() {
		Path productFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
		boolean result = Product.products.isEmpty();
		try {
			for (String line : Files.readAllLines(productFile)) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(result);
	}
}


