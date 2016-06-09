import static org.junit.Assert.*;

import org.junit.Test;

public class NoogieTest {

	@Test
	public void testCoogie0() {
		Noogie n = new Noogie(0);
		assertEquals(0, n.coogie());
	}

	@Test
	public void testCoogie1() {
		Noogie n = new Noogie(1);
		assertEquals(2, n.coogie());
	}
	
	@Test
	public void testSchmoogie2() {
		Noogie n = new Noogie(2);
		assertEquals(1, n.schmoogie());
	}
	
	@Test
	public void testSchmoogie5() {
		Noogie n = new Noogie(5);
		assertEquals(2, n.schmoogie());
	}
	
}
