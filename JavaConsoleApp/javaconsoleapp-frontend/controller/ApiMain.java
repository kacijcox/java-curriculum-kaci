package controller;
import data.InventoryRepository;
import service.InventoryService;

import java.io.IOException;

public class ApiMain {
	public static void main(String[] args) throws IOException {
		InventoryRepository inventoryRepository = new InventoryRepository();
		InventoryService inventoryService = new InventoryService(inventoryRepository);
		ApiServer apiServer = new ApiServer(inventoryService);
		apiServer.startServer();
	}
}