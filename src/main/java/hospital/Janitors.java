package hospital;

public class Janitors extends Employees implements canSweepUp {

	private boolean sweeping;

	public Janitors(String title, String name, int idNum, int salary) {
		super(title, name, idNum, salary);
	}
	public boolean sweeping(){
		return sweeping;
	}
	@Override
	public void isSweeping() {
		sweeping = !sweeping;
	}

}
