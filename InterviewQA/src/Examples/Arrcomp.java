package Examples;

import java.util.Arrays;

public class Arrcomp 
{

	public static void main(String[] args) 
	{
		System.out.println(m1());
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		boolean status=true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					status=false;
					break;
				}
			}
		}
		else
		{
		status=false;
		}
	
	if(status==false)
	{
		System.out.println("not same");
	}
	else
	{
		System.out.println("same");
	}

	}
	public static boolean m1()
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,4,6};
		boolean status=Arrays.equals(a, b);
		return status;
	}
}