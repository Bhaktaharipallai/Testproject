
public class WithoutMe {
	public static void main(String[] args) {
		String str="we will succeed one day";
	    String[] str1=str.split("");
	    int aschi=0;
	    for (int i=str1.length-1;i>=0; i++) {
          char[] ch=str1[i].toCharArray();
          for(char c:ch)
          {
        	  aschi=aschi+c;
          }
          System.out.println(str1[i]+aschi+" ");
          aschi=0;
		}
 	   
    }
       
	}



