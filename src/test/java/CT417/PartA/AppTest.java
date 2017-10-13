package CT417.PartA;

import org.junit.*;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	@Test
	public void test() {
		Student s = new Student ("Nichlos", "Tesla",880649556,161,"10/07/1856");
		assertEquals("NichlosTesla161",s.getUsername());
	}
}
