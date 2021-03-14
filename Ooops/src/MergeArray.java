import java.util.Iterator;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter size of one array");
		int n = sc.nextInt();	 
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of second array");
		int n1 = sc.nextInt();	 
		int[] b = new int[n1];
		
		for (int i = 0; i < n1; i++) {
			b[i]=sc.nextInt();
		}
       
		int a_length=a.length;
		int b_length=b.length;
		int c_length=a.length+b.length;
		int[] c=new int[c_length];
		System.out.println("The merge array is ....");
		for (int i = 0; i < a_length; i++) {
			c[i]=a[i];
		}
		for (int i = 0; i < b_length; i++) {
			c[a_length+i]=b[i];
		}
		for (int i = 0; i < c_length; i++) {
			System.out.println(c[i]);
		}
	}

}
