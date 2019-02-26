package hospital;

public class Patients {

	public String name;
	public int bloodLevel;
	public int healthLevel;

	public Patients(String name, int bloodLevel, int healthLevel) {
		super();
		this.name = name;
		this.bloodLevel = 20;
		this.healthLevel = 10;

	}

	public String getName() {
		return name;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void drawBlood() {
		bloodLevel -= 1;
		healthLevel += 1;
	}

	public void increaseHealth(int i) {
		healthLevel += i;
	}

	public void increaseBlood(int i) {
		bloodLevel += i;
	}

	public void decreaseBlood(int i) {
		bloodLevel += i;
	}

	public void decreaseHealth(int i) {
		bloodLevel += i;
	}

	public void giveCare(int i) {
		healthLevel += i;

	}

}
