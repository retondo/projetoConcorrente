package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import data.Data;

public class ReadFile {
	
	// read a input file and write the data to sudoku matrix
	public void readFile(String fileName, Data data) throws IOException {
		
		try {
			Scanner file = new Scanner(new File(fileName));
			int value, x, y;
			
			// while file has line to read, save the value of the element
			while (file.hasNextLine()) {
				value = file.nextInt();
				x = file.nextInt();
				y = file.nextInt();
				data.setElement(value, x-1, y-1);
			}
			file.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
