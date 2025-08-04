package com.example.demo.coin_price_client;

import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EthCoinPriceClient {
    @Value("{api.key}")
    // private final String BASE_URL = "https://api.coingecko.com/api/v3/simple/price";
    private final HttpClient client;

    public EthCoinPriceClient() {
        client = HttpClient.newHttpClient();
    }

    public String findEthCoinPrice() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=ethereum&names=Ethereum&symbols=eth&include_market_cap=true&include_24hr_vol=true&include_24hr_change=true&include_last_updated_at=true&precision=full"))
                .header("accept", "application/json")
                .header("x-cg-api-key", "{api.key}")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return "";
    }
}