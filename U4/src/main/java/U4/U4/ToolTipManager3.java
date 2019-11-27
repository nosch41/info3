package U4.U4;

public class ToolTipManager3  {

	/*private static ToolTipManager3 instance = new ToolTipManager3();
	public static ToolTipManager3 getInstance() {
		System.out.println("ToolTipManager3::getInstance()");
		return instance;

	}*/
	private static ToolTipManager3 instance;
	private ToolTipManager3() {
		System.out.println("Neues Singleton erzeugt.");
	}

	//the 'synchronized' keyword solves the problem of two threads simultaneously initialising the instance. Instead they have to wait for their individual turn for the method.
	public static synchronized ToolTipManager3 getInstance() {
		if(instance==null) {
			instance=new ToolTipManager3();
		}
		return instance;


	}
	public void operation() {
		System.out.println("operation() aufgerufen "	+ "instance hash code" + this.hashCode());

	}


}
