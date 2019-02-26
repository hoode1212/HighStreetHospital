package hospital;

public abstract class Nurses extends Employees implements canDrawBlood, giveCare{

	public Nurses(String title, String name, int idNum, int salary) {
		super(title, name, idNum, salary);
		
	}

	public void canDrawBlood(Patients patient) {
		patient.drawBlood();
		
	}

	public void cangiveCare(Patients patient) {
		patient.giveCare();
	}


	public int getbloodLevel() {
		return 0;
	}


}
