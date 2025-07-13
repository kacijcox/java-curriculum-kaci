package data;

import model.Product;
import service.InventoryService;
import ui.MenuUserInput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static model.Product.products;

public class InventoryRepository {
    final Path productFile = Paths.get("inventory.csv");

    public void add(Product product) throws IOException {
        products.put(String.valueOf(product.getProductID()), product);
    }

    public void serializeProduct(Product product) throws IOException {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product);

        if (Files.exists(productFile)) {
            String csvLine = product.toCsvString();
            Files.write(productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
        }
    }

    public ArrayList<Product> deserialize() throws IOException {
        ArrayList<Product> productList = new ArrayList<>();

        List<String> lines = Files.readAllLines(productFile);
        lines.remove(0);

        for (String line : lines) {
            String[] csvLine = line.split(",");
            Product deserializeProduct = new Product();
            Product product = deserializeProduct.parseCsvLineToProduct(csvLine);
            productList.add(product);
        }
        return productList;
    }

    public void delete(int userSelectionProductID) throws IOException {
        ArrayList<Product> productList = deserialize();
        for (Product p : productList) {
            if (p.getProductID() == userSelectionProductID) {
                products.remove(String.valueOf(userSelectionProductID));
                productList.remove(p);
                Files.write(productFile, p.productHeader().getBytes());
                for (Product ignored : productList) {
                    String csvLine = p.toCsvString();
                    Files.write(productFile, csvLine.getBytes(), StandardOpenOption.APPEND);
                }
                break;
            }
        }
    }

    public void find(int userSelectionProductID) throws IOException {
        ArrayList<Product> productList = deserialize();

        for (Product product : productList) {
            if (product.getProductID() == userSelectionProductID || products.containsKey(String.valueOf(userSelectionProductID))) {
                product.formatUpdateProductGetter();
            }
        }
    }

    public void save() throws IOException {
        Path savedFile = Path.of("inventory.csv");

        FileWriter writer = new FileWriter(savedFile.toFile());
        writer.write("Product ID | Product Name | Price,Quantity | Perishable\n");

        for (Product p : products.values()) {
            writer.write(p.toCsvString());
            writer.write("\n");
        }
        writer.close();
    }

    public void load() throws IOException {
        Path savedFile = Path.of("inventory.csv");

        products.clear();

        List<String> lines = Files.readAllLines(savedFile);
        lines.remove(0);

        Product product = null;
        for (String line : lines) {
            String[] items = line.split(",");
            product = new Product();
            product = product.parseCsvLineToProduct(items);
            products.put(String.valueOf(product.getProductID()), product);
        }
        if (product != null) {
            product.formatUpdateProductGetter();
        }
    }

    //shows the products in memory before they are added to the file, otherwise we load() and display() would have identical functionality
    public void display() throws IOException {
        products.values().forEach(Product::formatUpdateProductGetter);
    }

    public void update(Product product, int userSelectionProductID) throws IOException {
        String productKey = String.valueOf(userSelectionProductID);
        products.put(productKey, product);
    }
}







