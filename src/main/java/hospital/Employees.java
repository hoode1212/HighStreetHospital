package hospital;

public abstract class Employees {

	public String title;
	public String name;
	public int idNum;
	public int salary;

	public Employees(String title, String name, int idNum, int salary) {
		this.name = name;
		this.title = title;
		this.idNum = idNum;
		this.salary = salary;

	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public int getIdNum() {
		return idNum;
	}

	public int getSalary() {
		return salary;
	}

	public abstract String toString();

	{

	}
}