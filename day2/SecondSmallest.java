package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class SecondSmallest {
	public static void main(String[] args) {
		List<Integer> var1=new ArrayList<Integer>();
		var1.add(3);
		var1.add(2);
		var1.add(11);
		var1.add(4);
		var1.add(6);
		var1.add(7);
		//LinkedHashSet<Integer> text1=new LinkedHashSet<Integer>(var1);
		Collections.sort(var1);
		System.out.println(var1);
		int s=var1.size();
		System.out.println(var1.get(s-2));
	}

}


