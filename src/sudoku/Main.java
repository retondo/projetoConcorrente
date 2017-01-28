package sudoku;

import java.io.IOException;
import java.util.Scanner;
import data.Matrix;

public class Main {
	
	public static void main(String[] args) {
		Matrix m = new Matrix();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Insira o nome do arquivo de entrada: ");
		String fileName = s.next();
		
		// Lê o arquivo de entrada e imprime a matriz
		try {
			m.read(fileName);
			m.print();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		
		

	}

}
