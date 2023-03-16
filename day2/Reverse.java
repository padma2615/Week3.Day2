package week3.day2;

public class Reverse {
	public static void main(String[] args) {
		
		{
			String value1="madam";
			
			String value2="";
			char[] rev = value1.toCharArray();
			for(int i=rev.length-1;i>=0;i--)
				
			{
		       value2=value2+rev[i];	
							
			}
			System.out.println(value2);
			
			if(value1.equalsIgnoreCase(value2))
			{
				System.out.println("The given string is palindrome");
			}
			
			
		}
	}

}
