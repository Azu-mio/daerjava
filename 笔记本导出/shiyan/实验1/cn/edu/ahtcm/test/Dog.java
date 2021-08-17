package cn.edu.ahtcm.test;

public class Dog extends Animal {
	String catagory;
	
	//2.有参构造方法
	public Dog(String name, double weight, String color, String catagory) {
		super(name, weight, color);
		this.catagory = catagory;
	}

	//3.重写父类的run（）方法（输出“dog run fastly”）；eat（）（输出“dog love bone”）
	@Override
	void run() {
		System.out.println("dog run fastly");
	}
	@Override
	void eat() {
		System.out.println("dog love bone");
	}

	public Dog(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4.在main方法里新建一个对象d1（new调用构造方法，Dog d1 = new ….），然后打印输出的d1的run和eat方法
		Dog d1 = new Dog("小玉",4,"black","金毛");
		d1.run();
		d1.eat();
		
		//5.在main方法里新建一个对象d2（new调用构造方法, Animal d2 = new ….），然后打印输出的d2的run和eat方法,观察java的多态
		Animal d2 = new Dog("小向",4,"yellow","柴犬");
		d2.run();
		d2.eat();
		
		//6.将d2 强制转换为Dog类型，并使用关键字instanceof判断d2是否是Dog类型，如果是打印输出d2的种类值。
	
		if(d2 instanceof Dog){
			System.out.println(((Dog)d2).catagory);
		}
		
	}

}