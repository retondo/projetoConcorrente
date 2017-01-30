package sudoku;

import data.Matrix;

public class SolveSubmatrix {
	private char submatrix;
	private Matrix matrix;
	private int i, j, m, n;
	
	public SolveSubmatrix(Matrix matrix, char submatrix) {
		this.submatrix = submatrix;
		this.matrix = matrix;
		i = j = m = n = 0;
	}
	
	/*@Override
	public void start() {
		solve();
	}*/
	
	private synchronized int[] missingNumbers(int x, int y) {
		int[] row = matrix.getRow(x), column = matrix.getColumn(y);
		int[] squa = new int[9], aux = new int[9];
		int k = 0, p = 0, q = 0;
		
		// Fill an auxiliar array with 1..9 
		// and change the existing numbers in square, row and column by 0 on aux array 
		for (p=0; p<9; p++) {
			aux[p] = p+1;
		}
		
		// set new i,j
		p = i; q = j;
		setInitialCoordinates();
		
		// Fill squa vector until x,y coordinate
		for (; i<=x; i++) {
			for (; j<=y; j++) {
				k = 0;
				int value = matrix.getCellValue(i, j);
				if (value != 0) {
					for (k = 0; k < 9 && value != aux[k]; k++);
					if (k < 9)
						squa[k] = 0;
				}
			}
		}
		i = p; j = q;
		
		// Splice 3 vectors
		int[] numbers = new int[row.length + column.length + squa.length];
	    for (p = 0, q = 0; p < row.length; p++, q++) {
	        if (row[p] != 0)
	    		numbers[q] = row[p];
	        
	        if (column[p] != 0)
	        	numbers[++q] = column[p];
	        
	        if (squa[p] != 0)
	        	numbers[++q] = squa[p];
	    }
	    
	    // Match values between numbers and aux vectors are assigned in aux by 0
		for (p = 0; p < numbers.length; p++) {
			if (numbers[p] != 0) {
				for (q = 0; q < 9 && numbers[p] != aux[q]; q++);
				if (q < 9)
					aux[q] = 0;
			}
		}
		
		return aux;
	}
	
	private void setInitialCoordinates() {
		// Set i initial coordinate 
		if (submatrix == 'A' || submatrix == 'B' || submatrix == 'C') {
			i = 0;
			m = 3;
		} else if (submatrix == 'D' || submatrix == 'E' || submatrix == 'F') {
			i = 3;
			m = 6;
		} else {
			i = 6;
			m = 9;
		}
		
		// Set j initial coordinate
		if (submatrix == 'A' || submatrix == 'D' || submatrix == 'G') {
			j = 0;
			n = 3;
		} else if (submatrix == 'B' || submatrix == 'E' || submatrix == 'H') {
			j = 3;
			n = 6;
		} else {
			j = 6;
			n = 9;
		}
	}
	
	public void solve() {
		int[] mn;
		int w;
		
		setInitialCoordinates();
		
		int c, r = i, t = j;
		//for (c = 0; c < 3; c++) {
			for (; i<m; i++) {
				for (; j<n; j++) {
					mn = missingNumbers(i, j);
					
					if (matrix.getCellValue(i, j) == 0) {
						for (w = 0; w < 9 && mn[w] == 0; w++);
						matrix.setCellValue(mn[w], i, j);
					} else {
						Error e = new Error("Célula "+i+","+j+" não está vazia.");
						System.out.println(e.getMessage());
					}
				}
				j = t;
			}
		//}
	}
	
}
