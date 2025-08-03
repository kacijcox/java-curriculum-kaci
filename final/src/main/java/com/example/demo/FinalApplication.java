package com.example.demo;

import com.example.demo.api.CoinPriceClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FinalApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		//     SpringApplication.run(FinalProjectApplication.class, args);
		CoinPriceClient coinPriceClient = new CoinPriceClient();
		System.out.println(coinPriceClient.findAll());
	}
}
