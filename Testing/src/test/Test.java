package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import utility.collection.ArrayStack;
import utility.collection.StackADT;

class Test {
	private StackADT<String> test;
	@BeforeEach
	void setUp() throws Exception {
		test = new ArrayStack<>();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@org.junit.jupiter.api.Test
	void testIsEmpty() {
		assertEquals(true, test.isEmpty());
		test.push("Testing");
		assertEquals(false, test.isEmpty());
	}
	@org.junit.jupiter.api.Test
	void testSize() {
		for (int i = 0; i < 1500; i++) {
			test.push(String.valueOf(i));
		}
		test.push(null);
		test.pop();
		assertEquals(1500, test.size());
		
	}
	@org.junit.jupiter.api.Test
	void testPeek() {
		test.push("Test");
		assertEquals("Test", test.peek());
		assertEquals(1, test.size());
		
	}
	@org.junit.jupiter.api.Test
	void testIndexOf() {
		test.push("1");
		test.push(null);
		assertEquals(0, test.indexOf("1"));
		assertEquals(1, test.indexOf(null));
	}
	@org.junit.jupiter.api.Test
	void testPop() {
		test.push("1");
		assertEquals("1", test.pop());
		assertEquals(0, test.size());
		assertThrows(IllegalStateException.class, ()-> test.pop());
	}


}
