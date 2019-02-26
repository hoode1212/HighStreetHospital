import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import hospital.Nurses;
import hospital.Patients;

public class NursesTest {

	Nurses underTest;
	Patients patientsTest;

	@Before
	public void setup() {
		underTest = new Nurses("Nurse","Mary", 654, 50000);
		patientsTest = new Patients("Lenny", 20, 10);
		
	}
}