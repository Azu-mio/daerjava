package lei;

public class Animal {
	private String name;
	private String color;
	private int weight;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	void run(){
		System.out.println("Animal run fastly");
	}
	void eat(){
		System.out.println("Animal eat something");
	}
	protected void shout(){
		System.out.println("Animal shout");
	}
	
	void run(String name){
		System.out.println(name + " run fastly");
	}
	

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}


	public Animal(String name, String color, int weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}


	public static void main(String[] args) {
		Animal a = new Animal("大黄","block",23);
//		a.name = "大黄";
//		a.weight = 23;
//		a.color = "block";
		System.out.println(a);
	
		
		

	}

}
