package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		
	Integer[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
	List<Integer> var1=new ArrayList<Integer>(Arrays.asList(arr));
	Collections.sort(var1);
	System.out.println(var1);
	for(int i=0;i<var1.size();i++)
	{
		for(int j=i+1;j<var1.size();j++)
		{
			if(var1.get(i)==var1.get(j))
			{
			    System.out.println("The duplicates are"+var1.get(j));	
			}
		}
	}
	}

}

