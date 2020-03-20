package pkg1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	
	@Test
	public void test() {
		myclass ob1 = new myclass();
		assertEquals(7, ob1.sum(2, 5));
	}

	
}
