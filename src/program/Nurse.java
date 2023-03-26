package program;

public class Nurse extends HospitalEmployee {
	
	public int numOfPatients;

	public int getNumOfPatients() {
		return numOfPatients;
	}

	public void setNumOfPatients(int numOfPatients) {
		this.numOfPatients = numOfPatients;
	}

	public Nurse(String name, int number, int numOfPatients) {
		super(name, number);
		this.numOfPatients = numOfPatients;
	}

	@Override
	public String toString() {
		return name +" "+ number+" has "+numOfPatients+" patients";
	}
	
	public void work() {
		
		super.work();
		System.out.print(name +" is a nurse with "+numOfPatients+" patients");
	}

}
