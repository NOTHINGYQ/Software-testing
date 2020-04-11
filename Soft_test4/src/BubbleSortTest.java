
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BubbleSortTest {
	private BubbleSort b;
	
	@Before
	public void setUp() throws Exception{
		b = new BubbleSort();
	}
	
	@After
	public void tearDown() throws Exception{
		b = null;
	}
	
	@Test
	public void testBubbleSort(){
		int test[] = new int[]{1,7,3,3,5,6};
		int testR[] = new int[]{1,3,3,5,6,7};
		assertEquals(Arrays.toString(testR),Arrays.toString(b.BubbleSort(test)));
	}
}
	