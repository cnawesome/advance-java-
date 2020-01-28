package java线程;
/*synchronized实现互斥，需要与一个对象联系，让操作与对象挂钩
 * 
 * 面试问题：同步方法和非同步方法能同时运行吗
 * 能
 * 
 * 脏读，同步与非同步混乱
 * 
 * 锁内调用不会死锁（一个同步方法调用另一个同步方法）
 * 
 * 出现异常可能导致锁被释放
 */
public class synchronizeOrNotSynchronized {
	public synchronized void m1()
	{
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"m1 end");
		
		
	}
	public void m2()
	{
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"m2 end");
		
		
	}
	
	public static void main(String[] args) {
		synchronizeOrNotSynchronized s=new synchronizeOrNotSynchronized();
		new Thread(()->s.m1(),"m1").start();//lambda表达式，runable一个对象，在对象运行run方法 
		new Thread(()->s.m1(),"m1").start();
		
		
	}
}
