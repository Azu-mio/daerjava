package cn.edu.ahtcm.test;

public class Animal {
	//1.定义成员变量：名称name，体重weight，颜色color，成员变量定义为私有的，同时生成相应的get和set方法；
	private	String name;
	private	double weight;
	private	String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//2.包括void动态方法run（）（输出“Animal run fastly”）；void eat（）（输出“Animal eat something”），以及受保护的叫方法shout()(输出“Animal shout”)
	void run(){
		
	}	
	void eat(){
		
	}	
	private void shout(){
		System.out.println("Animal shout");
	}
	
	//3.定义重载方法run(String name),输出谁跑得快
	void run(String name){
		System.out.println(name+" run fastly");
	}
	
	//4.包括有参构造方法
	public Animal(String name, double weight, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	
	//5.重写toString()方法，实现打印输出成员变量的值；
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//6.在main方法里新建一个对象a（new调用构造方法），然后打印输出a的各个成员变量，再通过set方法改变name值，再调用两个run方法和eat方法
		Animal a = new Animal("富贵",3,"black");
		System.out.println(a);
		System.out.println(a.name);
		System.out.println(a.weight);
		System.out.println(a.color);
		a.setName("小富贵");
		a.run();
		a.run(a.name);
		a.eat();
	}

}