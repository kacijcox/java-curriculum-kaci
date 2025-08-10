package com.example.demo;


import com.example.demo.priceclient.BitcoinPriceClient;
import com.example.demo.priceclient.EthPriceClient;
import com.example.demo.priceclient.SolPriceClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FinalApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		     SpringApplication.run(FinalApplication.class, args);
//		BitcoinPriceClient bitcoinCoinPriceClient = new BitcoinPriceClient();
//		EthPriceClient ethCoinPriceClient = new EthPriceClient();
//		SolPriceClient solCoinPriceClient = new SolPriceClient();
//
//		System.out.println(bitcoinCoinPriceClient.findBitcoinPrice());
//		System.out.println(ethCoinPriceClient.findEthPrice());
//		System.out.println(solCoinPriceClient.findSolPrice());
	}
}
