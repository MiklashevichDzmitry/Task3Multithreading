package com.epam.jwd;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.epam.jwd.entity.Van;
import com.epam.jwd.reader.CustomReader;

public class ThreadMain {
	public static void main(String[] args) throws IOException {
		CustomReader fileReader = CustomReader.getInstance();
		List<Van> vanList = fileReader.readVan("src\\main\\resources\\file\\vans.txt");
		ExecutorService executor;
		executor = Executors.newFixedThreadPool(vanList.size());
		for (Van van : vanList) {
			executor.execute(van);
		}
		executor.shutdown();
	}
}
