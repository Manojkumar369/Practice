package Examples;

public class Fibonacci {

	public static void main(String[] args) {
		int t2=1;
		int t1=0;
		int sum=0;
		while(sum<100)
		{
			sum=t1+t2;
			t1=t2;
			t2=sum;
			System.out.println(sum);
		}
	}

}
