//business logic
//user interaction
//repo calls
package service;

import data.InventoryRepository;
import model.Product;
import ui.MenuUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static model.Product.products;

public class InventoryService {
    private final InventoryRepository inventoryRepository;


    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public void addProduct(Product product) throws IOException {
        try {
            products.containsKey(String.valueOf(product.getProductID()));

            if (!products.containsKey(String.valueOf(product.getProductID()))) {
                inventoryRepository.add(product);
            }
        } catch (IOException e) {
            System.out.println("Invalid Input\n");
        }
    }

    public ArrayList<Product> deserializeProduct() throws IOException {
        try {
            return inventoryRepository.deserialize();
        } catch (IOException e) {
            System.out.println("Invalid Input\n");
        }
        return null;
    }

    public void deleteProduct(int userSelectionProductID) throws IOException {
        try {
            if (products.isEmpty()) {
                System.out.println("No Products To Delete\n");
            } else {
                inventoryRepository.delete(userSelectionProductID);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number\n");
        }
    }

    public void displayAll() throws IOException {
        try {
            if (products.isEmpty()) {
                System.out.println("No Products To Display\n");
            } else {
                inventoryRepository.display();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Selection\n");
        }
    }

    public void searchProduct(int userSelectionProductID) throws IOException {
        try {
            ArrayList<Product> productList = deserializeProduct();
            if (productList.isEmpty()) {
                System.out.println("No Products Exist To Search\n");
            } else {
                inventoryRepository.find(userSelectionProductID);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number Or Product Does Not Exist\n");
        }
    }

    public void saveProduct() throws IOException {
        try {
            if (products.isEmpty()) {
                System.out.println("There Is Nothing To Save");
            } else {
                inventoryRepository.save();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Selection");
        }
    }

    public void loadProduct() throws IOException {

        try {
            if (products.isEmpty()) {
                System.out.println("There Is Nothing To Load");
            } else {
                inventoryRepository.load();
            }
        } catch (IOException e) {
            System.out.println("Invalid Input");
        }
    }

    public void updateProduct(Product product, int userSelectionProductID) throws IOException {
        try {
            if (products.isEmpty()) {
                System.out.println("Product Not Found\n");
            } else {
                inventoryRepository.update(product, userSelectionProductID);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input Or Product Does Not Exist\n");
        }
    }
}
