package com.epam.jwd.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import com.epam.jwd.entity.Van;
import com.epam.jwd.reader.parser.VanParser;

public class CustomReader {
	//private static final Logger logger = LogManager.getLogger(CustomReader.class);

	private static CustomReader instance;

	private CustomReader() {
	    }

	public static CustomReader getInstance() {
		if (instance == null) {
			instance = new CustomReader();
		}
		return instance;
	}

	public List<Van> readVan(String path) throws IOException {
		Path pathClass = Paths.get(path);
		List<Van> vans = new ArrayList<>();
		List<String> lines = Files.lines(pathClass).toList();
		for (var s : lines) {
			vans.add(VanParser.parse(s));
		}
		//logger.log(Level.INFO, "DATA WAS READ FROM A FILE");
		return vans;
	}
}
