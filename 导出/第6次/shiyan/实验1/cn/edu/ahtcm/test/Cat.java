package cn.edu.ahtcm.test;

public class Cat extends Animal implements Ianimal {

	public Cat(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		System.out.println("cat run fastly");
	}

	@Override
	public void eat() {
		System.out.println("cat like eat fish");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat a = new Cat("kk",12,"black");
		a.eat();
		a.run();
		
	}

}
