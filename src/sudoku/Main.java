package sudoku;

import java.io.IOException;
import java.util.Scanner;
import data.Matrix;

public class Main {
	
	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		Solver solver = new Solver(matrix);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o nome do arquivo de entrada: ");
		String fileName = scanner.next();
		
		// Read input and print the result
		try {
			matrix.read(fileName);
			solver.solve();
			matrix.print();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		

	}

}
