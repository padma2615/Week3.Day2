package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
	public static void main(String[] args) {
		List<Integer> var1=new ArrayList<Integer>();
		var1.add(3);
		var1.add(2);
		var1.add(11);
		var1.add(4);
		var1.add(6);
		var1.add(7);
		List<Integer> var2=new ArrayList<Integer>();
		var2.add(1);
		var2.add(2);
		var2.add(8);
		var2.add(4);
		var2.add(9);
		var2.add(7);
		for(int i=0;i<=var1.size()-1;i++)
		{
			for(int j=0;j<=var2.size()-1;j++)
			{
				if(var1.get(i)==var2.get(j)) {
					System.out.println("The Intersection elements are"+var1.get(i));
					
				}
			}
		}
		
			
	}
;
}
