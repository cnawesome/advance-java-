package java�߳�;
/*synchronizedʵ�ֻ��⣬��Ҫ��һ��������ϵ���ò��������ҹ�
 * 
 * �������⣺ͬ�������ͷ�ͬ��������ͬʱ������
 * ��
 * 
 * �����ͬ�����ͬ������
 * 
 * ���ڵ��ò���������һ��ͬ������������һ��ͬ��������
 * 
 * �����쳣���ܵ��������ͷ�
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
		new Thread(()->s.m1(),"m1").start();//lambda���ʽ��runableһ�������ڶ�������run���� 
		new Thread(()->s.m1(),"m1").start();
		
		
	}
}
