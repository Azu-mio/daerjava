package kkk.kkk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//����
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[10];
		
		//���ϣ���̬�任�����顣
		LinkedList ls = new LinkedList();
		
		//ͨ���������޶��������ͣ���߽ӿڣ��ұ��þ���ʵ����
		List<String> l3 = new ArrayList<String>();
		
		//����,����ԭ��û��������װ�������͡�		
		ArrayList l =new ArrayList();
		l.add("apple");
		l.add("banana");
		l.add(90);
		System.out.println(l);
		//ͨ���������޶��������͡�
		ArrayList<String> l2 = new ArrayList<String>();//���޶�ֻ��װ���͵�����ֻ���String�ĳ�
		l2.add("apple");
		l2.add("banana");
		l2.add("pear");
		
		//����
		//1
		System.out.println("==============1===================");
		for (int i=0;i<l2.size();i++){
			System.out.println(l2.get(i));
		}
		//2 ��ǿѭ������
		System.out.println("==============2===================");
		for(String s1:l2){
			System.out.println(s1);//s1ӦΪs��������kҲ��
		}
		//3
		System.out.println("==============3===================");
		l2.forEach(v->System.out.println(v));
		//jdk8 lamb ���ʽ����
		
		//4
		System.out.println("==============4===================");
		Iterator<String> it =l2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//���
		l2.add("water");
		//ɾ��
		l2.remove(1);
		//��ѯ�ٶȿ죬ArrayList������
		System.out.println(l2.get(1));
		System.out.println(l2);
	}

}
