package cn.edu.ahtcm.bean;

import java.util.HashMap;
import java.util.Map;

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
	
		/*substring(int beginIndex, int endIndex)
		 * 返回从起始位置（beginIndex）到目标位置（endIndex）之间的字符串，
		 * 但不包含目标位置（endIndex）的字符
		 *用这个方法可以截取字符串然后将其存入集合中作为键*/
//如果键存在，将值加一，首先这个方法很陌生似乎并不知道这种还有这种操作，
//我们可以用get方法将此键对应值取出放在一个临时变量t里，然后将临时变量t加一再用put方法放进去  
//可以用containsKey方法map集合中是否存在指定的key，将其添加进去，并将值置为1；

		Map <String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<100;i++){
			if(map.containsKey(sb.substring(i,i+1))){
				int t = map.get(sb.substring(i,i+1))+1;
				map.put(sb.substring(i,i+1),t);
			}else{
				map.put(sb.substring(i,i+1),1);
			}		
		}
		
//遍历打印出集合的键和值
		map.forEach((id,val)->System.out.println(id+" "+val));
		
		
	}
}
