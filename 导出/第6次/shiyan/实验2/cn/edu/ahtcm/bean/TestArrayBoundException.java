package cn.edu.ahtcm.bean;
/*
2019207320123 
  耿立博 
21.5.11
 */
public class TestArrayBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//（1）定义字符串数组s，里面存放{“Apple”,”pear”,”banana”}；
		String s[] = {"apple","pear","banana"};
//（2）循环打印输出每个元素，对于下标越界进行异常捕获；
		try{
			for(int i=0;i<4;i++){
				System.out.println(s[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
//（3）最后不管是否有错误都打印输出“打印完毕”。
			System.out.println("打印完毕");
		}
		
	}
}


