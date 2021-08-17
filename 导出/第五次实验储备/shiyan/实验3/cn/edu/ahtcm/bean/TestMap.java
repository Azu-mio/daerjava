package cn.edu.ahtcm.bean;

/*
4.定义一个类TestMap要求如下
（1）利用Map接口和泛型新建一个字典HashMap对象map，然后插入如下键值对
1 China
2 India
3 USA
（2）打印输出key为1的值；
（3）查阅api文档和互联网资料，分别用3种不同的方法对此map对象进行遍历打印输出；
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1,"China");
		map.put(2,"India");
		map.put(3,"USA");
		
		System.out.println(map.get(1));
		
		System.out.println("==============1===================");
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
			System.out.println(map.get(it.next()));
		}
		
		System.out.println("==============2===================");
		for(Entry<Integer,String> e:map.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("==============3===================");
		map.forEach((id,val)->System.out.println(id+" "+val));
	}

}
