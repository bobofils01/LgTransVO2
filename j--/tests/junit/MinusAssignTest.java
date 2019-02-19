package junit;

import junit.framework.TestCase;

public class MinusAssignTest extends TestCase {
	private int a;

	protected void setUp() throws Exception {
		super.setUp();
		a = 2;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMinusAssign() {
		int tmp = a;
		this.assertFalse(a == 0);
		a -= 1;
		tmp = tmp - 1;
		this.assertEquals(a, tmp);
		a -= 5;
		tmp = tmp - 5;
		this.assertEquals(a, tmp);
	}
}