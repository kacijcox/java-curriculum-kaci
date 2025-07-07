package data;
import model.Product;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InventoryRepositoryTest {
	List<String> testProducts = new ArrayList<String>();
	static final Path productFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

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
	@Test
	public void InventoryRepository_serialize_serializeAProduct() {




	}
}


