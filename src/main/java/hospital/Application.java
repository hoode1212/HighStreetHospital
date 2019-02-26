package hospital;

import java.util.HashMap;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Clinic employees = new Clinic(new HashMap<>());
		Clinic patients = new Clinic(new HashMap<>());
		boolean isOpen = true;
		
		
		Surgeons Shakes = new Surgeons("Heart","Shakes", 123, 120000);
		Doctors Dre = new Doctors("Dr.","Dre", 187, 90000);
		Nurses Mary = new Nurses("Nurse","MaryJane", 654, 50000);
		Receptionists Moneypenny = new Receptionists("Receptionist", "Moneypenny", 007, 45000);
		Janitors Donte = new Janitors("Janitor", "Donte", 777, 40000);
		Janitors Vlad = new Janitors("Janitor", "Vlad", 666, 40000);
		Patients Laverne = new Patients("Laverne", 0, 0);
		Patients Shirley = new Patients("Shirley", 0, 0);
		Patients Lenny = new Patients("Lenny", 0, 0);
		Patients Squigy = new Patients("Squigy", 0, 0);
		
		employees.addSurgeons();
		employees.addDoctors();
		employees.addNurses();
		employees.addReceptionists();
		employees.addJanitors();
		patients.addPatients();
		
		
		System.out.println(" Welcome to the High Street Clinic");
		

		}


}
