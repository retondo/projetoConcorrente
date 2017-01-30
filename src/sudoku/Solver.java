package sudoku;

import data.Matrix;
import sudoku.SolveSubmatrix;

public class Solver {
	private Matrix m;
	private String rule;
	
	public Solver(Matrix matrix) {
		this.m = matrix;
	}
	
	public void solve() {
		rule = m.getRulesSolution();
		SolveSubmatrix s1, s2;
		
		for (int i=0; i<9; i++) {
			s1 = new SolveSubmatrix(m, rule.charAt(i));
			//s2 = new SolveSubmatrix(m, rule.charAt(i+1));
			s1.solve();
			//s2.start();
			/*try {
				s1.join();
				s2.join();
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}*/
			m.print();
		}
		
	}
	
	
}