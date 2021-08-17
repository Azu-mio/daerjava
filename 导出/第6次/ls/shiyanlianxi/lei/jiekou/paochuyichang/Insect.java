package lei.jiekou.paochuyichang;

public class Insect {
	String name;
	int size;
	String color;
	
	public Insect(String name, int size, String color) {
		super();
		this.name = name;
		this.size = size;
		this.color = color;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	void run(Insect a){
		System.out.println(a.name + " is running");
	}
	public static void main(String[] args) {
		Insect i = new Insect("xiaokun",1,"black");
		System.out.println(i.name);
		System.out.println(i.size);
		System.out.println(i.color);
		i.run(i);
	}

}
