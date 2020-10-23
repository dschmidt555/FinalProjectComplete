package finalProject;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class MenuIteratorTest {

	@Test
	void test() {
		
		HashMap<String, String> testHash = new HashMap();
		testHash.put("Eggs", "Breakfast");

		MenuIterator junit = new MenuIterator();
		
		String result = junit.MenuIteratorMethod(testHash);
		
		assertEquals("Breakfast", result);
	
	}

}
