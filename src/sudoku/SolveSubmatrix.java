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
		int[] row = m.getRow(x);
		int[] column = m.getColumn(y);
		int[] aux = new int[9];
		
		for (int i=0; i<9; i++) {
			aux[i] = i+1;
		}
		
		// TODO verificar numeros existentes no quadrado 3x3
		
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
