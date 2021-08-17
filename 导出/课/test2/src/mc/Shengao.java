package mc;
/*
 * 2021.4.25
 */
import java.util.Scanner;

public class Shengao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yingchi;
		double yingcun;
//		double rr;
		Scanner in = new Scanner(System.in);
		yingchi = in.nextInt();
		yingcun = in.nextDouble();
//		rr = (yingchi+yingcun/12.0)*0.3048;
		System.out.println("yintgchi="+yingchi+","+"yingcun="+yingcun);
		System.out.println((yingchi+yingcun/12)*0.3048);

	}

}
