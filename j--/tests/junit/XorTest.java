package junit;

import junit.framework.TestCase;
import pass.Xor;

public class XorTest extends TestCase {
	private Xor exOr;

	protected void setUp() throws Exception {
		super.setUp();
		exOr = new Xor();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		
	}

	public void testXor() {
		this.assertEquals(exOr.xor(1, 1), 0);
		this.assertEquals(exOr.xor(0, 1), 1);
		this.assertEquals(exOr.xor(0, 0), 0);
	}
}