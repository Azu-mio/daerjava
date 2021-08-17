package cn.edu.ahtcm.thread;

/*（1）创建线程t1（使用继承Thread方式），run方法打印“Thread 1 start”和当前线程名称；
（2）创建线程t2（使用实现Runnable接口方式），run方法打印“Thread 2 start”和当前线程名称；
（3）创建线程t3（使用java8 lambda方式），run方法打印“Thread 3 start”和当前线程名称；
（4）启动三个线程；
（5）主线程main打印“main end”；
（6）分别使用join方法和sleep方法确保主线程main打印的信息“main end”在最后输出；
（7）包名：cn.edu.ahtcm.thread
 */
public class TestRunThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread();
		Thread t2 = new Thread(new Thread2());
		Thread t3 = new Thread(()->{
			System.out.println("Thread 3 start");
			System.out.println("当前线程名称为线程3");
		});
		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("main end");
	}

}


class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Thread 1 start");
		System.out.println("当前线程名称为线程1");
	}
	
}

//实现Runnable接口
class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 2 start");
		System.out.println("当前线程名称为线程2");
	}
	
}