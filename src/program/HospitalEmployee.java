package program;

public class HospitalEmployee {
	
	protected String name;
	protected int number;
	public HospitalEmployee(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public HospitalEmployee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return name + " "+ number;
	}
	public void work() {
		
		System.out.print("\n"+""+name +" Works for hospital. ");
	}
	
	

}
