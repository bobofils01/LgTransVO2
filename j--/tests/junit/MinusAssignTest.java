package junit;

import junit.framework.TestCase;
import pass.MinusAssign;

public class MinusAssignTest extends TestCase {
	private int a;
	private MinusAssign minusAssign;
	protected void setUp() throws Exception {
		super.setUp();
		a = 2;
		minusAssign = new MinusAssign();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	} 

	public void testMinusAssign() {
		int tmp = a;
		this.assertFalse(a == 0);
		
		a = minusAssign.minusAssign(a, 1);
		tmp = tmp - 1;
		this.assertEquals(a, tmp);
		a = minusAssign.minusAssign(a, 5);
		tmp = tmp - 5;
		this.assertEquals(a, tmp);
	}
}