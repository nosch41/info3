package U4.U4;


public class SingletonTestThread extends Thread{
	public String threadName;
	public SingletonTestThread(String Name) {
		threadName=Name;

	}
	public void run(){
		try {
			Thread.sleep(500);
			System.out.println(threadName + "- call 1");
			ToolTipManager2.getInstance().operation();
			Thread.sleep(500);
			System.out.println(threadName + "- call 2");
			ToolTipManager2.getInstance().operation();
			Thread.sleep(500);
			System.out.println(threadName + "- call 3");
			ToolTipManager2.getInstance().operation();
		}
		catch(InterruptedException ie) {

			System.out.println(threadName + "- interrupted");


		}

	}
}
