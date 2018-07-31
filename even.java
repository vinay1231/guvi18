import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int range,limit;
		Scanner sc=new Scanner(System.in);
		limit=sc.nextInt();
		range=sc.nextInt();
		for(int i=limit+1; i<range;i++)
		{
		           if( i%2== 0)	
		
			{
				System.out.print(i);
			}
		}	
		
	}
}
