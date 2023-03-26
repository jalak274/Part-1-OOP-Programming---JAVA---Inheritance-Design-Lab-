package program;

public class Surgeon extends Doctor {

	public boolean operating;

	


	public Surgeon(String name, int number, String specialty, boolean operating) {
		super(name, number, specialty);
		this.operating = operating;
	}

	public String toString() {
		return name +" "+ number+" "+specialty+" Operating: "+operating;
	}


	public void work()
	{

		
		if(operating == true)
			super.work();
			System.out.print(name+" is operating now.");
	}

	
	
}
