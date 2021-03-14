package Starpatteren;

public class Solution {

	public static void main(String[] args) {
		
		int row = 5;
		int coloum = 5;
		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < coloum; j++) {
				
				if (i == 0 || j == 0 || i == j || i+j == row) {
					System.out.print("*");
				} else {
					System.out.println(" ");
				}
			}
		}
	}
}
