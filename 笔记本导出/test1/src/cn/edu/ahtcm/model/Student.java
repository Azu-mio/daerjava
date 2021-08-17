package cn.edu.ahtcm.model;
/*
 * student number:2019207320123
 * name:耿立博
 * date:2021.4.9
 */
public class Student {
	//成员变量
	String name;
	String classid;
	String studentnumber;
	String password;
	String gender;
	String totalentrancescore;
	//有参构造方法
	public Student(String name, String classid, String studentnumber, String password, String gender,
			String totalentrancescore) {
		super();
		this.name = name;
		this.classid = classid;
		this.studentnumber = studentnumber;
		this.password = password;
		this.gender = gender;
		this.totalentrancescore = totalentrancescore;
	}
	//方法
	void login(){
		System.out.println("login success");
	}
	void logout(){
		System.out.println("login out success");
	}
	//重载
	void login(String studentname){
		System.out.println(studentname + " login sucess");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("耿立博","2019级计算机3班","2019207320123","123","男","486");
		System.out.println(s.name);
		System.out.println(s.classid);
		System.out.println(s.studentnumber);
		System.out.println(s.password);
		System.out.println(s.gender);
		System.out.println(s.totalentrancescore);
		s.login();
		s.logout();
		s.login("耿立博");
	}

}
