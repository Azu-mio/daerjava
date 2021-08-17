package cn.edu.ahtcm.thread4;


import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import cn.edu.ahtcm.thread4.Counter;


public class TestSaleTicketThread4 {

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
	
}

class TicketWindow implements Runnable{
	
	private ReentrantLock lock = new ReentrantLock();
	@Override
	   public void run() {
        try {

            // 上锁
            lock.lock();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (Counter.count > 0){
            	System.out.println(Thread.currentThread().getName()+"票号:"+Counter.count);
                Counter.count--;
            }
        } finally {
            //  解锁
            lock.unlock();
        }
	}
}
