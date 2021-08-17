package cn.edu.ahtcm.bean;
/*3．新建一个java类LetterCount，要求如下
（1）随机生成100个小写字母（a-z）存入字符串数组；
（2）统计输出100个字母中，各个字母出现的次数
实现思路供参考：
（1）	使用Math.random()*26+’a’ 随机生成字母，存入字符串数组s；
（2）	对s进行遍历，存入集合map，如果key存在value+1，否则value=1； */
public class LetterCount {

	public static void main(String[] args) {
		StringBuilder sb = new  StringBuilder("");
		
		for(int i=0;i<100;i++){			
			sb.append((char)(Math.random()*26+'a'));
		}
		System.out.println(sb);
		
		
	}
}
