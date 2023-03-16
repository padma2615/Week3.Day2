package week3.day2;


import java.util.Arrays;
import java.util.LinkedHashSet;
public class DuplicatesUsingList {
	public static void main(String[] args) {
		String text="We learn java basics as part of java session in java week";
		String[] word=text.split(" ");
		String result=" ";
		LinkedHashSet<String> text1=new LinkedHashSet<String>(Arrays.asList(word));
		
		for(String var: text1)
		{
			result=result+var+" ";
		}
		
		System.out.println(result);
		
		
	}

}
