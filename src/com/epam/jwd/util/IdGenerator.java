package com.epam.jwd.util;

public class IdGenerator {

	private static int counter;

	private IdGenerator() {
	}

	public static int generate() {
		return ++counter;
	}

}
