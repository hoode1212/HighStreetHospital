package hospital;

public class Receptionists extends Employees implements canAnswerPhone {

	public Receptionists(String title, String name, int idNum, int salary) {
		super(title, name, idNum, salary);

	}

	@Override
	public void canAnswerPhone() {

	}

}
