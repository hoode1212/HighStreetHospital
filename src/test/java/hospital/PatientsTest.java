package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hospital.Patients;

public class PatientsTest {
	Patients underTest;

	@Before
	public void setup() {
		underTest = new Patients("Laverne", 20, 10);

	}

	@Test
	public void shouldHaveName() {
		underTest.getName();
		assertEquals("Laverne", underTest.getName());
	}

}
