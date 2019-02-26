package hospital;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeesTest {

	Employees underTest;

	@Before
	public void setup() {
		underTest = new Surgeons("Surgeon", "Shakes", 123, 120000);

	}

	@Test
	public void shouldHaveName() {
		underTest.getName();
		assertEquals("Shakes", underTest.getName());

	}

}
