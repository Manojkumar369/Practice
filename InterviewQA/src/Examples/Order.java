package Examples;

import java.util.Arrays;

public class Order {

	public static void main(String[] args) {
		isDigitNum();
		int arr[]= {0,2,3,6,1,4,5,8,7,9};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i)
			
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(i==arr[j])
					{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					}
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
	}
public static  void isDigitNum()
{
	String str="asndlka923rqndjwQWERT!@#$%03i202";
	boolean b;
	for(int i=0;i<str.length();i++)
	{
		b=Character.isDigit(str.charAt(i));
		//System.out.println(str.charAt(i)+"   "+b);
		if(b==true)
		{
			System.out.print(str.charAt(i));
		}
	}
	
}
}
