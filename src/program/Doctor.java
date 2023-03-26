public class Doctor extends HospitalEmployee {
public String areaOfExpertise;

public String getAreaOfExpertise() {
	return areaOfExpertise;
}

public void setAreaOfExpertise(String areaOfExpertise) {
	this.areaOfExpertise = areaOfExpertise;
}

public Doctor(String name, int number, String areaOfExpertise) {
	super(name, number);
	this.areaOfExpertise = areaOfExpertise;
}

public Doctor(String name, int number) {
	super(name, number);
}

@Override
public String toString() {
	return name +" "+ number+" "+areaOfExpertise;
}


public void work()
{
		super.work();

		if(Thread.currentThread().getStackTrace()[2].getClassName() != "program.Surgeon")
		{
			System.out.print(name +" is an "+areaOfExpertise+" Doctor. ");

		}
}
}
