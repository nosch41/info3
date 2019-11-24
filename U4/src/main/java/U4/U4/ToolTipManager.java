package U4.U4;


public final class ToolTipManager{
		private static ToolTipManager instance;
		private ToolTipManager() {
			System.out.println("Neues Singleton erzeugt.");
		}
	public static ToolTipManager getInstance() {
		if(instance==null) {
			instance=new ToolTipManager();
		}
		return instance;
		
		
	}
	public void operation() {
		System.out.println("operation() aufgerufen "	+ "instance hash code" + this.hashCode());
		
	}
	}


