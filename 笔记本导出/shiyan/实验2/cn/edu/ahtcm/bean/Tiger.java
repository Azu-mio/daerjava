package cn.edu.ahtcm.bean;
/*
2019207320123 
  耿立博 
21.5.11
 */
public class Tiger extends AbsAnimal {

	public Tiger(String name, int size, String color) {
		super(name, size, color);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//（1）在main方法中实例化一个Tiger对象
		Tiger t = new Tiger("泰哥",100,"黄色");
//（2）调用run方法，查看输出结果
		t.run();
	}

}
