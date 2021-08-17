package cn.edu.ahtcm.test;
/*1.定义一个类TestMap要求如下：
（1）新建一个字典HashMap对象（使用泛型），然后插入如下键值对，其中key为整型，value为字符串
1   China
2   India 
3   USA 
（2）删除key值为3的元素；
（3）再添加一个键值对{4=Canada}；
（2）分别用3种不同的方法对此Map对象进行遍历打印输出

 */
import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"China");
		map.put(2,"India");
		map.put(3,"USA");
		//通过java8 中文手册查询remove用法来删除
		map.remove(3);
		System.out.println(map);
		map.put(4,"Canada");
		
	}

}
