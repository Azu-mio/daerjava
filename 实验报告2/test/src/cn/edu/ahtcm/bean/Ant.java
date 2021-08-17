package cn.edu.ahtcm.bean;
/*
2019207320123 
  耿立博 
21.5.11
 */
//（1）继承Insect，实现接口IAttack
public class Ant extends Insect implements IAttack {

	public Ant(String name, int size, String color) {
		super(name, size, color);
		// TODO Auto-generated constructor stub
	}
//（2）实现move（）方法：打印输出"Ant move slowly"；
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Ant move slowly");
	}
//（3）实现attack（）方法：打印输出"Ant bite people"；
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Ant bite people");
	}
//（4）重写父类的run（）方法，打印输出"Ant walk step by step";	
	@Override
	void run(Insect a) {
		// TODO Auto-generated method stub
		System.out.println("Ant walk step by step");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//（5）在main函数new一个Ant实例对象，赋值给对象a，Ant a = new Ant(…)调用move和attack、run、grow方法

		Ant a = new Ant("蚂蚁a",1,"黑色");
		a.move();
		a.attack();
		a.run(a);
		a.grow();
	}

}
