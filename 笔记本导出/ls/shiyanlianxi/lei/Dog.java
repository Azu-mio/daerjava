package lei;

public class Dog extends Animal {
	String category;	
	public Dog(String name, String color, int weight, String category) {
		super(name, color, weight);
		this.category = category;
	}
	
	

	@Override
	void run() {
		System.out.println("dog run fastly");		
	}



	@Override
	void eat() {
		System.out.println("dog love bone");
	}



	public static void main(String[] args) {
		Dog d1 = new Dog("大黑","black",25,"柴犬");
		d1.run();
		d1.eat();
		d1.shout();
		Animal d2 = new Dog("大橙","orange",21,"柴");
		d2.eat();
		d2.run();
	}

}
