
import java.util.Scanner;

public class Findduplicateelement {
	public static void main(String[] args) {
	  int[] b= {10,20,10,30,20,40};
		for (int i = 0; i < b.length; i++) {
			for (int j =i+1; j < b.length; j++) {
			  if((b[i]==b[j]) && i!=j)
			  {
				  System.out.println(b[j]+" " );
			  }
			}
			
		}
	}

}
