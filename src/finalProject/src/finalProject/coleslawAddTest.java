package finalProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class coleslawAddTest {

	@Test
	void test() {
		
		coleslawAdd junit = new coleslawAdd();


		int result = junit.execute(100);
		assertEquals(101, result);
	
		

		
		
	}

}
