package com.eddiefiggie.util;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
		String filename = "test.txt";
		char delimiter = ',';
		int header = 1;

		CSVHandler csv = new CSVHandler(filename, delimiter, header);

		for (String s : csv.getData()) {
			System.out.println(s);
		}
	}
}
