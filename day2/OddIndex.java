package week3.day2;

public class OddIndex {
	public static void main(String[] args) {
		String test="changeme";
		char[] charArray = test.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(charArray[i]);
			}
			else
			{
				System.out.println(Character.toUpperCase(charArray[i]));
			}
		
		}
		
		
	}

}
