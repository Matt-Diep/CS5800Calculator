package cs.calcu;

import static org.junit.Assert.*;

import org.junit.Test;



public class MainTest {

	@Test
	public void checkValidInput() {
		Inputparser parser = new Inputparser();
		boolean result = parser.checkInput("10 + 5");
		assertTrue(result);
	}
	
	@Test
	public void checkInvalidinput() {
		Inputparser parser = new Inputparser();
		boolean result = parser.checkInput("10+5");
		assertFalse(result);
	}
	
	@Test
	public void checkSeperateStringFirst() {
		Inputparser parser = new Inputparser();
		Equation equation = new Equation();
		Equation testEquation = new Equation();
		testEquation.setFirst(10);
		testEquation.setOprand("+");
		testEquation.setSecond(5);
		equation = parser.seperateInput("10 + 5");
		assertTrue("First Not Equal", equation.getFirst() - testEquation.getFirst() == 0);
	}
	
	@Test
	public void checkSeperateStringOprand() {
		Inputparser parser = new Inputparser();
		Equation equation = new Equation();
		Equation testEquation = new Equation();
		testEquation.setFirst(10);
		testEquation.setOprand("+");
		testEquation.setSecond(5);
		equation = parser.seperateInput("10 + 5");
		assertEquals(equation.getOprand(), testEquation.getOprand());
	}
	
	@Test
	public void checkSeperateStringSecond() {
		Inputparser parser = new Inputparser();
		Equation equation = new Equation();
		Equation testEquation = new Equation();
		testEquation.setFirst(10);
		testEquation.setOprand("+");
		testEquation.setSecond(5);
		equation = parser.seperateInput("10 + 5");
		assertTrue("Second Not Equal", equation.getSecond() - testEquation.getSecond() == 0);
	}

}
