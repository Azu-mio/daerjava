package mc;

import java.util.Scanner;

public class D2t1_UTCBJT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);		
		int UTC = in.nextInt();
		int BTC = UTC - 800;
		if(UTC<800){
			BTC = UTC - 800 + 2400;
			System.out.println(BTC);
		}
		else{
			System.out.println(BTC);
		}
	

	}

}
