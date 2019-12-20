package Examples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash {
	public static void main(String args[])
	{
	dupl();
	
	}
public void mapex()
{
	Map<String, Integer> m=new HashMap<String, Integer>();
	m.put("Chiru", 100);
	m.put("Bal", 125);
	m.put("nag", 135);
	m.put("venky", 145);
	m.put("ntr", 175);
	System.out.println("elements are :"+m);
	System.out.println("what is ntr get "+m.get("Ntr"));
	m.remove("Bal");
	System.out.println("after remove  bal , elements are :"+m);
	System.out.println(m.containsKey("venky"));
	System.out.println("elements size "+m.size());
	System.out.println(m.put("venky", 1000));
	System.out.println("element ntr is present or not" +m.containsKey("ntr"));
	/*Collections coll=(Collections) m.values();
	System.out.println("values are "+coll);*/
	Set<Entry<String, Integer>> set=m.entrySet();
		Iterator<Entry<String, Integer>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<String, Integer> m1=itr.next();
			if((Integer)m1.getValue()==135)
			{
				System.out.println(m1.getKey());
				m1.setValue(0);
				System.out.println(m1);
			}
		}
		System.out.println(m);
		m.clear();
		System.out.println(m);
	}

public static void dupl()
{
	String[] names= {"manoj","durga","kumar","ravi","manoj"};
	Map<String ,Integer> map=new HashMap<String , Integer>();
	for(String name:names)
	{
		Integer count=map.get(name);
		if(count==null)
		{
		map.put(name, 1);
		}
		else
		{
			map.put(name, count++);
		}
	}
	
	Set<Entry<String , Integer>> set=map.entrySet();
	System.out.println(map);
	for(Entry<String , Integer> entry:set)
		{
		if(entry.getValue()>1)
		
		{
			System.out.println("duplicate is "+entry.getKey());
		}
		}
	}	
}
