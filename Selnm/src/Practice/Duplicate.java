package Practice;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
	static String names[]= {"manoj","kumar","narendra","varma","prthyusj","kumar","hanuma","varma"};

	public static void main(String[] args) {
		dupset();
	}
public static void dupl()
{
	for(int i=0;i<names.length;i++)
	{
		for(int j=i+1;j<names.length;j++)
		{
			if(names[i].equals(names[j]))
			{
				System.out.println("duplicate is"+names[j]);
			}
		}
	}
}

public static void dupset()
{
	Set s=new HashSet();
	for(String name:names)
	{
		if(s.add(name)==false)
		{
			System.out.println("duplicate is"+name);
		}
	}
}
}
