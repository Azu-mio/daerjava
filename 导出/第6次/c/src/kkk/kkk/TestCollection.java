package kkk.kkk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//容器
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[10];
		
		//集合：动态变换的数组。
		LinkedList ls = new LinkedList();
		
		//通过范类来限定数据类型，左边接口，右边用具体实现类
		List<String> l3 = new ArrayList<String>();
		
		//容器,警告原因，没有限制所装数据类型。		
		ArrayList l =new ArrayList();
		l.add("apple");
		l.add("banana");
		l.add(90);
		System.out.println(l);
		//通过泛型拉限定数据类型。
		ArrayList<String> l2 = new ArrayList<String>();//若限定只能装整型的数据只需把String改成
		l2.add("apple");
		l2.add("banana");
		l2.add("pear");
		
		//遍历
		//1
		System.out.println("==============1===================");
		for (int i=0;i<l2.size();i++){
			System.out.println(l2.get(i));
		}
		//2 超强循环遍历
		System.out.println("==============2===================");
		for(String s1:l2){
			System.out.println(s1);//s1应为s但报错用k也行
		}
		//3
		System.out.println("==============3===================");
		l2.forEach(v->System.out.println(v));
		//jdk8 lamb 表达式遍历
		
		//4
		System.out.println("==============4===================");
		Iterator<String> it =l2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//添加
		l2.add("water");
		//删除
		l2.remove(1);
		//查询速度快，ArrayList的优势
		System.out.println(l2.get(1));
		System.out.println(l2);
	}

}
