package cn.edu.ahtcm.bean;
/*
2019207320123 
耿立博 
21.5.11
 */
public interface IAttack {
	//（1）包含静态的不可改变的字符串常量值ADDRESS字符串，内容为"China";
	public final static String COUNTRY = "China";
	//（2）包含两个方法move（）和attack（）
	void move();
	void attack();
	//（3）包含默认方法default void grow()实现内容为打印输出"Insect grows fastly"
	default void grow(){
		System.out.println("Insect grows fastly");
	}
	
}
