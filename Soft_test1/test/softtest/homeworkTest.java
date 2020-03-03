package softtest;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;

public class homeworkTest {
	public homework t;

	@Before
	public void setUp() throws Exception {
		t = new homework();
	}

	@Test
	public void test1() {
		assertEquals(1,t.isOk(4));
		
	}
	@Test
	public void test2(){
		assertEquals(1,t.isOk(15));
	}
	@Test
	public void test3(){
		assertEquals(0,t.isOk(100));
	}
	
	@Test
	public void test4(){
		assertEquals(1,t.isOk(67));
	}
	
	
	@Test
	public void testhomework(){
		t.homework(39);
	}
	

}
