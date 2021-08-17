package cn.edu.ahtcm.bean;
/*
2019207320123 
  耿立博 
21.5.11
 */
public abstract class AbsAnimal {
//（1）包括属性name，weight，color;
	String name;
	int size;
	String color;
	
//（2）定义其有参构造方法;
	public AbsAnimal(String name, int size, String color) {
		super();
		this.name = name;
		this.size = size;
		this.color = color;
	}
//（3）定义受保护的run方法，功能是打印输出"Animal run fastly";
	protected void run(){
		System.out.println("Animal run fastly");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//（4）在main方法里实例化抽象对象a,AbsAnimal a = new AbsAnimal(….) ，想一想为什么会报错？如果报错注释掉该语句。
//		AbsAnimal a = new AbsAnimal("旺财",50,"黄色");
		//报错原因:抽象类不能被实例化只能被继承

	}
}
