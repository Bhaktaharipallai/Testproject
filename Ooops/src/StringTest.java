import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
 public static void main(String[] args) {
	 
	 String str="we will succed one day";
//	 Pattern p=Pattern.compile("[a-zA-Z]+");
//	          Matcher matcher = p.matcher(str);
	       ArrayList<String> str1=new ArrayList<>();
	         String s="";
	          
	          for (int i = 0; i < str.length(); i++) {
	        	  if(str.charAt(i)!=' ')
	        		   s+=str.charAt(i);
	        	  
	        	  else
	        	  {
	        		    str1.add(s);
	        		    s="";
	        	  }
	        		   
				
	 		}
	          str1.add(s);
	         
	        for(int i=str1.size()-1;i>=0;i--)
	        {
	        	  String str2=str1.get(i);
	        	  int c=0;
	        	  for(int j=0;j<str2.length();j++)
	        	  {
	        		  c+=str2.charAt(j); 
	        	  }
	        	  System.out.print(str2+c+" ");
	        	
	        }
	        System.out.println();
	        	     
//	
//	String[] str2=str.split(" ");
//	int asci=0;
//	for (int i = str2.length-1;i>=0; i--) {
//		char[] ch=str2[i].toCharArray();
//		for(char c:ch)
//		{
//			asci=asci+c;
//		}
//		System.out.print(str2[i]+asci+" ");
//		asci=0;
//	}
}
}
