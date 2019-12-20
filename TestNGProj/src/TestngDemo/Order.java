package TestngDemo;

import java.util.Arrays;

public class Order {

	public static void main(String[] args) {
	int a[]= {0,2,1,3,5,4,6,9,7,8,10};
	int temp;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=i)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]==i)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	System.out.println(Arrays.toString(a));
	}

}
