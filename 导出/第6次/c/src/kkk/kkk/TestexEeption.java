package kkk.kkk;

public class TestexEeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 0;
		double c = 0;
		//对可能发生错误的地方进行处理，异常处理
		try{
			c = a/b;
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println(c);
			//无论如何都将c的值输出
		}
		

	}

}
