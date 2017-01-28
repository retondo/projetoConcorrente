package sudoku;

import data.Matrix;

public class Solver {
	private char rootSubmatrix;		// Input submatrix -> A, B, C, D, E, F, G, H or I 
	
	private void verifyRootMatrix(Matrix matrix) {
		int[] smallerCoordinate = new int[2];
		
		smallerCoordinate[0] = matrix.getSmallerXInput();
		smallerCoordinate[1] = matrix.getSmallerYInput();
		
		if (smallerCoordinate[0] == 1 && smallerCoordinate[1] == 1) {
			rootSubmatrix = 'A';
		} else if (smallerCoordinate[0] == 1 && smallerCoordinate[1] == 4) {
			rootSubmatrix = 'B';
		} else if (smallerCoordinate[0] == 1 && smallerCoordinate[1] == 7) {
			rootSubmatrix = 'C';
		} else if (smallerCoordinate[0] == 4 && smallerCoordinate[1] == 1) {
			rootSubmatrix = 'D';
		} else if (smallerCoordinate[0] == 4 && smallerCoordinate[1] == 4) {
			rootSubmatrix = 'E';
		} else if (smallerCoordinate[0] == 4 && smallerCoordinate[1] == 7) {
			rootSubmatrix = 'F';
		} else if (smallerCoordinate[0] == 7 && smallerCoordinate[1] == 1) {
			rootSubmatrix = 'G';
		} else if (smallerCoordinate[0] == 7 && smallerCoordinate[1] == 4) {
			rootSubmatrix = 'H';
		} else if (smallerCoordinate[0] == 7 && smallerCoordinate[1] == 7) {
			rootSubmatrix = 'I';
		}
	}
}
