package hospital;

public class Doctors extends Employees implements canDrawBlood, giveCare {

	public Doctors(String title, String name, int idNum, int salary) {
		super(title, name, idNum, salary);

	}

	public static void main(String[] args) {

	}

	@Override
	public void canDrawBlood() {

	}

	@Override
	public void giveCare() {

	}

}
