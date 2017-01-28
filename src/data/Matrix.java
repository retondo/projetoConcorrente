package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Matrix {
	private int[][] matrix;
	private int smallerXInput;		// Store the smaller (x,y) coordinate to identify submatrix
	private int smallerYInput;
	
	public Matrix() {
		this.matrix = new int[9][9];
		this.smallerXInput = 0;
		this.smallerYInput = 0;
	}
	
	public int[] getRow(int x) {
		return matrix[x];
	}

	public int getCellValue(int x, int y) {
		return matrix[x][y];
	}

	public void setCellValue(int value, int x, int y) {
		matrix[x][y] = value;
	}
	
	public int getSmallerXInput() {
		return smallerXInput;
	}

	public int getSmallerYInput() {
		return smallerYInput;
	}
	
	// Read a input file and write the data to sudoku matrix
	public void read(String fileName) throws IOException {
		try {
			Scanner file = new Scanner(new File(fileName));
			int value, x, y;
			
			// While file has line to read, save the value of the element
			while (file.hasNextLine()) {
				value = file.nextInt();
				x = file.nextInt();
				y = file.nextInt();
				setCellValue(value, x-1, y-1);
				
				// set smaller (x,y) coordinates
				if (smallerXInput == 0)
					smallerXInput = x;
				else if (smallerXInput != 1) {
					if (x < smallerXInput)
						smallerXInput = x;
				}
				
				if (smallerYInput == 0)
					smallerYInput = y;
				else if (smallerYInput != 1) {
					if (y < smallerYInput)
						smallerYInput = y;
				}
			}
			file.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void print() {
		int j, i;
		int[] line;
		
		System.out.println("+-----------------------------+");
		for (i=j=0; i < 9; i++) {
			line = getRow(i);
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
