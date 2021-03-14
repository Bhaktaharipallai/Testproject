
public class StrTest {

	public static void main(String[] args) {
		String str="We will succeed one day";
		String[] str1=new String[5];
		int aschi=0;
		int j=0;
		String temp=" ";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ')
			{
				temp=temp+str.charAt(i);
			}
			else
			{
				str1[j]=temp;
				temp="";
				j++;
			}
			str1[j]=temp;
		}
		for (int k= str1.length-1;k>=0;k--) 
		{
			 char[] ch=str1[k].toCharArray();
			 for(char c:ch)
			 {
				 aschi=aschi+c;
			 }
			 System.out.print(str1[k]+aschi+" ");
			 aschi=0;
		}

	}

}
