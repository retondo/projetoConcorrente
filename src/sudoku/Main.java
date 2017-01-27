package sudoku;

import java.io.IOException;
import java.util.Scanner;
import data.Data;
import io.PrintMatrix;
import io.ReadFile;

public class Main {
	
	public static void main(String[] args) {
		Data data = new Data();
		ReadFile rf = new ReadFile();
		PrintMatrix print = new PrintMatrix();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Insira o nome do arquivo de entrada: ");
		String fileName = s.next();
		
		try {
			rf.readFile(fileName, data);
			print.print(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		
		

	}

}
