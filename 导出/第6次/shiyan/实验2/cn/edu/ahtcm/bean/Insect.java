package cn.edu.ahtcm.bean;
/*
 2019207320123 
   耿立博 
 21.5.11
  */
public class Insect {
	//（1）包括属性name，size，color
	String name;
	int size;
	String color;
	
	//（2）定义其有参构造方法;
	public Insect(String name, int size, String color) {
		super();
		this.name = name;
		this.size = size;
		this.color = color;
	}
	//（3）生成成员变量的get和set方法；
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

	//（4）定义run方法 void run(Insect a)打印输入谁在跑，接收参数为Insect类型；
	void run(Insect a){
		System.out.println(a.name +" is running");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//（5）在main函数测试该类new一个实例对象i，调用run方法，然后打印输出i的name，size，color
		Insect i = new Insect("螳螂",3,"绿色");
		i.run(i);
		System.out.println(i.name);
		System.out.println(i.size);
		System.out.println(i.color);
	}


}
