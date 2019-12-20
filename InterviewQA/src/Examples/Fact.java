package Examples;

public class Fact {

	public static void main(String[] args) {
		findFactorial(5);
		findArm(1236);
		findpolindrome(12321);
	}
public static void findFactorial(int num)
{
	int temp=1;
	for(int i=num;i>1;i--)
	{
		temp=temp*i;
		
	}
	System.out.println(temp);
}
public static void findArm(int num)
{
	
	int sum=0;
	int exp=num;
	while(num!=0)
	{
		
	
	int get=num%10;
	sum=sum+(get*get*get);
	num=num/10;
	}
	if (exp==sum)
	{
		System.out.println("its polindrome"+exp);
	}else
	{
		System.out.println("its not ppolindrome"+exp);
	}
}
public static void findpolindrome(int num)
{
	int exp=num;
	int sum=0;
	while(num!=0)
	{
	
	sum=(sum*10)+(num%10);
	num=num/10;
	}
	if (exp==sum)
	{
		System.out.println("its arm "+exp);
	}else
	{
		System.out.println("its not arm "+exp);
	}
}

}

