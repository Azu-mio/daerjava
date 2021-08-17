package cn.edu.ahtcm.test;

public interface Ianimal {
	public final static String COUNTRY = "China";
	void run();
	void eat();
	//如果父类的每个方法在子类中都要重写，适合把这些方法放到接口里。
	//接口中的方法父类中不要出现，否则引入父类和接口时不能自动重写。
	//jdk1.8之后允许在接口里有默认的方法。
	default void from(){
		System.out.println("Animal from China.");
	}
}
