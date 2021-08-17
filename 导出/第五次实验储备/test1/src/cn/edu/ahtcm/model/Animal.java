package cn.edu.ahtcm.model;

public class Animal {
	//成员变量定义
	int id;
	String name;
	int weight;
	
	//方法定义
	void run(String AnimalName){
		System.out.println(AnimalName + " run fastly!");
	}
	void eat(String AnimalName){
		System.out.println(AnimalName + " eat something!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal x = new Animal();
		x.id = 233;
		x.name = "Alice";
		x.run(x.name);
		x.eat(x.name);
//		System.out.println(x.name);
	}

}
