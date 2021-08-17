package cn.edu.athcm.thred3;

import cn.edu.athcm.thread2.Counter;
import cn.edu.athcm.thread2.TicketWindow;

public class TestSeleTicketThread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new TicketWindow());
		Thread t2 = new Thread(new TicketWindow());
		Thread t3 = new Thread(new TicketWindow());
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		t1.start();
		t2.start();
		t3.start();
	}

}
class Counter{
	public static int count = 1000;
	
	//定义锁对象
	public final static Object lock = new Counter();
	
}

public class TicketWindow implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//
			synchronized(Counter.lock){
				if(Counter.count>0){
					System.out.println(Thread.currentThread().getName()+"票号:"+Counter.count);
					Counter.count--;
				}else{
					break;
				}
			}

		}
		
	}
	
}