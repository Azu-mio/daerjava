package cn.edu.athcm.thread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread t1 = new MyThread();
//		MyThread t1 = new MyThread();
		Thread t1 = new MyThread();
		Thread t2 = new Thread(new Thread2());//推荐用
		//java8 lambda 表达式写法
		Thread t3 = new Thread(()->{
			System.out.println("thread3 run");
		});
		t1.start();
		t2.start();
		t3.start();
		
//		1
//		try {
//			Thread.sleep(10);//让主线程暂停10ms
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("hello");
	}

}

//通过继承Thread类 ，重写run方法。
class MyThread extends Thread{

	@Override
	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
		System.out.println("thread1 run");
	}
	
}

//实现Runnable接口
class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread2 run");
	}
	
}