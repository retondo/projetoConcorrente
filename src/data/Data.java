package data;

public class Data {
	private int[][] matrix;
	
	public Data() {
		this.matrix = new int[9][9];
	}
	
	public int[] getLine(int x) {
		return matrix[x];
	}

	public int getElement(int x, int y) {
		return matrix[x][y];
	}

	public void setElement(int value, int x, int y) {
		matrix[x][y] = value;
	}
	
}
