package week3.day2;


public class Duplicates {
	public static void main(String[] args) {
		String text="We learn java basics as part of java session in java week";
		int count=0;
		
		String[] split = text.split(" ");
		for(int i=0;i<=split.length-1;i++)
		{
			for(int j=i+1;j<=split.length-1;j++)
			{
				if(split[i].equalsIgnoreCase(split[j]))
				{
					//System.out.println(split[i]);
					split[j]="";
					count=count+1;
					
				}
			}
				
		}
		
		if(count>0)
		{
			for(int k=0;k<split.length;k++)
			{
				System.out.print(split[k]+" ");
			}
		}
		
	}

}
