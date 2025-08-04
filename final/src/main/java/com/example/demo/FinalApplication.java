package com.example.demo;

import com.example.demo.coin_price_client.BitcoinCoinPriceClient;
import com.example.demo.coin_price_client.EthCoinPriceClient;
import com.example.demo.coin_price_client.SolCoinPriceClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FinalApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		//     SpringApplication.run(FinalProjectApplication.class, args);
		BitcoinCoinPriceClient bitcoinCoinPriceClient = new BitcoinCoinPriceClient();
		EthCoinPriceClient ethCoinPriceClient = new EthCoinPriceClient();
		SolCoinPriceClient solCoinPriceClient = new SolCoinPriceClient();

		System.out.println(bitcoinCoinPriceClient.findBitcoinCoinPrice());
		System.out.println(ethCoinPriceClient.findEthCoinPrice());
		System.out.println(solCoinPriceClient.findSolCoinPrice());
	}
}
