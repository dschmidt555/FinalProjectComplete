package finalProject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BurgerFactoryTest {

	@Test
	void test() {
		
		BurgerFactory junit = new BurgerFactory();
		
		Burger test1 = junit.createBurger("Regular");
		assertEquals("Regular", test1.description);
		
		Burger test2 = junit.createBurger("Beast");
		assertEquals("Beast", test2.description);
		
		
		;
		
	}

}
