package io;

import data.Data;

public class PrintMatrix {
	
	public void print(Data data) {
		int j, i;
		int[] line;
		
		System.out.println("+-----------------------------+");
		for (i=j=0; i < 9; i++) {
			line = data.getLine(i);
			if ((i == 3) || (i == 6))
				System.out.println("|---------+---------+---------|");
			System.out.println(String.format("| %s  %s  %s | %s  %s  %s | %s  %s  %s |", 
					line[j],
					line[j+1],
					line[j+2],
					line[j+3],
					line[j+4],
					line[j+5],
					line[j+6],
					line[j+7],
					line[j+8]));
		}
		System.out.println("+-----------------------------+");
	}
}
