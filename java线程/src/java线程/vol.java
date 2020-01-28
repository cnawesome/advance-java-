package javaœﬂ≥Ã;

public class vol {
	volatile boolean runing=true;
	void m()
	{
		System.out.println("m start");
		while(runing) 
		{
			
		}
		System.out.println("m end");
	}

	public static void main(String []args) {
		vol vol=new vol();
		new Thread(vol::m,"v").start();
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vol.runing=false;
		
	}
}
	
	