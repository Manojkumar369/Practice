package Examples;



public class RegEx {
	public static void main(String args[])
	{
		
		m2();
		
	}
public static void m1()
{
	
	String act="word is:abc.dFdg?123afm.";
	System.out.println(act.split(":")[1].replaceAll("[^a-z0-9]", "*"));
}
public static void m2()
{
	m1();
	String orig="abcdef:gaiabcnap";
	int count=0;
	char[] ch=orig.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				count++;
				String str=ch.toString();
				StringBuffer sbf=new StringBuffer(str);
				sbf.deleteCharAt(j);
			}
		}
		System.out.println(ch[i]+" is repeated "+count);
		count=0;
	}
	
}
}
