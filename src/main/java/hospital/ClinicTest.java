package hospital;

import static org.junit.Assert.;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClinicTest {
	
	private Doctors Doctors;
	private Surgeons Surgeons;
	private Nurses Nurses;
	private Receptionists Receptionists;
	private Janitors Janitors;
	private Patients Patients;
	private Object employees;
	 
	@Before
	public void setup() {
	


		Surgeons  = new Surgeons("Heart","Shakes", 123, 120000);
		Doctors = new Doctors("Dr.","Dre", 187, 90000);
		Nurses = new Nurses("Nurse","MaryJane", 654, 50000);
		Receptionists = new Receptionists("Receptionist", "Moneypenny", 007, 45000);
		Janitors = new Janitors("Janitor", "Donte", 777, 40000);
		Janitors = new Janitors("Janitor", "Vlad", 666, 40000);
		Patients = new Patients("Laverne", 0, 0);
		Patients = new Patients("Shirley", 0, 0);
		Patients = new Patients("Lenny", 0, 0);
		Patients = new Patients("Squigy", 0, 0);
	}
	@Test
	public void shouldGetAllEmployees(Object clinic) {
		clinic.addEmployees(employees);
		assertEquals(clinic.getAllEmployees());


}