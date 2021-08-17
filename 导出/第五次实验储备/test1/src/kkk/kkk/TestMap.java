package kkk.kkk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		
//		Map m = new HashMap();
		//错误		m.add(1,"China");  用put
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "China");
		m.put(2, "ha");
		m.put(3, "li");
		System.out.println(m);
		System.out.println(m.get(2));
		
		//遍历
		//1
		Iterator<Integer> it = m.keySet().iterator();
		while(it.hasNext()){
			System.out.println(m.get(it.next()));
		}
		//2
		for(Entry<Integer,String> e:m.entrySet()){
			System.out.println(m.get(e.getKey()));
			System.out.println(m.get(e.getValue()));
		}
		//3
		m.forEach((id,val)->System.out.println(id+" "+val));
		
	}

}
