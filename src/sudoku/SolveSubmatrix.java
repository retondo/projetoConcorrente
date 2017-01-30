package sudoku;

import data.Matrix;

public class SolveSubmatrix implements Runnable {
	private char s;
	private Matrix m;
	
	public SolveSubmatrix(Matrix matrix, char submatrix) {
		this.s = submatrix;
		this.m = matrix;
	}
	
	@Override
	public void run() {
		switch (s) {
		case 'A':
			solveSubmatrixA();
		case 'B':
			solveSubmatrixB();
		case 'C':
			solveSubmatrixC();
		case 'D':
			solveSubmatrixD();
		case 'E':
			solveSubmatrixE();
		case 'F':
			solveSubmatrixF();
		case 'G':
			solveSubmatrixG();
		case 'H':
			solveSubmatrixH();
		case 'I':
			solveSubmatrixI();
		}
	}
	
	private int[] missingNumbers(int x, int y, char square) {
		int[] row = m.getRow(x), column = m.getColumn(y);
		int[] squa = new int[9], aux = new int[9];
		int k = 0, i = 0, j = 0;
		
		// Fill an auxiliar array with 1..9 
		// and change the existing numbers in square by 0 on aux array 
		for (i=0; i<9; i++) {
			squa[i] = i+1;
		}
		
		switch (square) {
		case 'A':
			i = 0;
			j = 0;
		case 'B':
			i = 0;
			j = 3;
		case 'C':
			i = 0;
			j = 6;
		case 'D':
			i = 3;
			j = 0;
		case 'E':
			i = 3;
			j = 3;
		case 'F':
			i = 3;
			j = 6;
		case 'G':
			i = 6;
			j = 0;
		case 'H':
			i = 6;
			j = 3;
		case 'I':
			i = 6;
			j = 6;
		}
		
		for (; i<=x; i++) {
			for (; j<=y; j++) {
				k = 0;
				int value = m.getCellValue(i, j);
				if (value != 0) {
					while (value != squa[k])
						k++;
					squa[k] = 0;
				}
			}
		}
		
		// TODO juntar os numeros que faltam
		for (i=0, j=0; i<9; i++, j++) {
			
			
		}
		
		return aux;
	}
	
	private void solveSubmatrixA() {
		int[] mn;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				mn = missingNumbers(x, y);
			}
		}
	}
	
	private void solveSubmatrixB() {
		
	}

	private void solveSubmatrixC() {
		
	}
	
	private void solveSubmatrixD() {
		
	}
	
	private void solveSubmatrixE() {
		
	}
	
	private void solveSubmatrixF() {
		
	}
	
	private void solveSubmatrixG() {
		
	}
	
	private void solveSubmatrixH() {
		
	}
	
	private void solveSubmatrixI() {
		
	}
}
