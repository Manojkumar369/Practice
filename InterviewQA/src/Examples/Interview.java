package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {
		//largeSmall();
		//prime();
		//listofPrime();
		orderlist();
	}

	public static void largeSmall()
	{
		int numbers[]= {10, 20, 05, -12, 55, -112};
		int large=numbers[0];
		int small=numbers[0];
		System.out.println("total length "+numbers.length);
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>large)
			{
				large=numbers[i];
			}
			else
				if(numbers[i]<small)
				{
					small=numbers[i];
				}
		}
		System.out.println("array elements "+Arrays.toString(numbers));
		System.out.println("largest in array is "+ large);
		System.out.println("small in array is "+ small);
		
	}
	
	public static void prime()
	{
		System.out.println("enter a number ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int res=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				res++;
			}
		}
		if(res==2)
		System.out.println("prime number "+num);
		else
		System.out.println("number is not prime "+num);
	}
	
	public static void listofPrime() {
		int k=0;
		 Scanner s=new Scanner(System.in);
	        System.out.println("enter a number ");
	        int min=s.nextInt();
	        System.out.println("enter a number ");
	        int max=s.nextInt();
	        for(int i=min;i<=max;i++)
	        {
	        /*	if (isPrime(i)) 
	        	{  
	                System.out.println(i);  
	            } 
	        }*/
	            for(int j=2;j<=i/2;j++)
	            {
	                if(i%j==0)
	                {
	                   k++;
	                }
	             }
	            if(k==0)
                {
                    System.out.println(i);
                }
	            k=0;
	        }     
	}
/*	static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int j = 2; j <= n/2; j++) {  
	           if (n % j == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   } */
	
	public static void orderlist()
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("narendra");
		list.add("vijay");
		list.add("prathyush");
		list.add("Manoj");
		System.out.println("before sort , elements are: ");
		for(String str:list)
		{
			System.out.println(str);
		}
		
		Collections.sort(list);
		System.out.println("after sort , elements are: ");
		for(String str:list)
		{
			System.out.println(str);
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("after reverse sort , elements are: ");
		for(String str:list)
		{
			System.out.println(str);
		}
		
	}
}
