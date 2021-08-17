package cn.edu.ahtcm.bean;
/*
 2.定义一个类TestSet要求如下
（1）利用Set接口和泛型新建一个HashSet对象set，要求为String类型
（2）set依次添加"黄山"、"大蜀山"、"泰山"、"大蜀山"、"黄山";
（3）打印输出set查看结果；
（4）用Iterator遍历set
 */
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("黄山");
		set.add("大蜀山");
		set.add("泰山");
		set.add("大蜀山");
		set.add("黄山");
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
