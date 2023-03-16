package week3.day2;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) 
	{
				Integer [] a= {1,2,5,4,7,6,8};
				List<Integer> mis=new ArrayList<Integer>(Arrays.asList(a));
				Collections.sort(mis);
				System.out.println(mis);
				
				for (int i = 1; i < mis.size()-1; i++) 
				{
					if (i!=mis.get(i-1))
					{
						System.out.println("The Missing Number is "+i);
						break;
					}
				}
				
			}	
			

	}


