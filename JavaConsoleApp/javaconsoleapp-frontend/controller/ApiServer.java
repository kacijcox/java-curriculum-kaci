package controller;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import service.InventoryService;
import model.Product;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.HashMap;

public class ApiServer {
    private final InventoryService inventoryService;

    public ApiServer(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/api/products", new ProductHandler());
        server.setExecutor(null);
        server.start();

        System.out.println("Server started on port 8080");
    }

    class ProductHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Add CORS headers
            exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "http://localhost:3000");
            exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type");

            String method = exchange.getRequestMethod();

            if ("OPTIONS".equals(method)) {
                // Handle preflight request
                exchange.sendResponseHeaders(200, -1);
                return;
            }

            if ("GET".equals(method)) {
                handleGetRequest(exchange);
            } else if ("POST".equals(method)) {
                handlePostRequest(exchange);
            } else {
                exchange.sendResponseHeaders(405, -1); // Method not allowed
            }
        }

        private void handleGetRequest(HttpExchange exchange) throws IOException {
            String response = convertProductsToJson();
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

        private void handlePostRequest(HttpExchange exchange) throws IOException {
            // TODO: handle POST request to create new product
            String response = "{\"message\": \"POST not implemented yet\"}";
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(501, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    private String convertProductsToJson() {
        StringBuilder json = new StringBuilder();
        json.append("[");

        HashMap<String, Product> products = Product.products;
        boolean first = true;

        for (Product product : products.values()) {
            if (!first) {
                json.append(",");
            }
            json.append("{");
            json.append("\"productID\":").append(product.getProductID()).append(",");
            json.append("\"productName\":\"").append(product.getProductName()).append("\",");
            json.append("\"productPrice\":").append(product.getProductPrice()).append(",");
            json.append("\"productQuantity\":").append(product.getProductQuantity()).append(",");
            json.append("\"isPerishable\":").append(product.getPerishable());
            json.append("}");
            first = false;
        }

        json.append("]");
        return json.toString();
    }
}