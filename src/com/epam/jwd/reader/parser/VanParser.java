package com.epam.jwd.reader.parser;

import com.epam.jwd.entity.Van;

public class VanParser {

	public static Van parse(String s) {
		String[] a = s.split(" ");
		return new Van(Boolean.parseBoolean(a[1]), a[0], a[2]);
	}

}
