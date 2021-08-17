package cn.edu.ahtcm.bean;
/*3.定义一个类TestTreeSet，要求如下：
（1）定义TreeSet对象treeSet，左边用接口Set右边用TreeSet；
（2）依次添加“apple”，“pear”，“bannana”，“orange”；
（3）打印输出treeSet；观察输出的字符串输出顺序（注释说明为什么是有序的？按照什么顺序排列的？）
*/
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<String> treeset = new TreeSet<String>();
		treeset.add("apple");
		treeset.add("pear");
		treeset.add("bannana");
		treeset.add("orange");
		System.out.println(treeset);
//因为TreeSet采用二叉树遍历，可以对集合元素按照一定的比较规则进行排序。
//题中字符串按照字典排序
		
	}

}
