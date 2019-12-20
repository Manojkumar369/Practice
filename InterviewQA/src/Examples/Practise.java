package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
int temp;
int a[]= {1,10,5,3,2,4,6,9,8,7,0};
for(int i=0;i<a.length;i++)
{
	if(a[i]!=0)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]==i)
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
}
System.out.println(Arrays.toString(a));

}
}