import java.util.Iterator;
import java.util.Scanner;

public class Matrixaddition {
    public static void main(String[] args) {
    	int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns size");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int d[][]=new int[r][c];
		System.out.println("Enter the First matrix");
		for (int i = 0; i <r ; i++) 
			for (int j = 0; j < c; j++) 
				a[i][j ]=sc.nextInt();
		System.out.println("Enter the Second matrix");
		for (int i = 0; i <r ; i++) 
			for (int j = 0; j < c; j++) 
				b[i][j ]=sc.nextInt();
		for (int i = 0; i <r ; i++) 
			for (int j = 0; j < c; j++) 
				d[i][j ]=a[i][j]+b[i][j];
		System.out.println("Matrix A");
		for (int i = 0; i < r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+"  ");	 
			}
			System.out.println();
		}
		System.out.println("Matrix B");
		for (int i = 0; i < r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(b[i][j]+"  ");	 
			}
			System.out.println();
		}
		System.out.println("Matrix D");
		for (int i = 0; i < r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(d[i][j]+"  ");	 
			}
			System.out.println();
		}
	}
}
