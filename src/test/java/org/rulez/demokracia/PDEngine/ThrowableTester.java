package org.rulez.demokracia.PDEngine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ThrowableTester extends CreatedDefaultVoteRegistry {

	private Throwable thrown;

	public ThrowableTester() {
		super();
	}

	public ThrowableTester assertThrows(Thrower thrower) {
		thrown = null;
		try {
			thrower.throwException();
			fail("no exception thrown");
		} catch (Throwable exception) {
			thrown = exception;
		}
		return this;
	}

	public void assertMessageIs(String message) {
		assertEquals(thrown.getMessage(),message);
	}
}