package cs.calcu;

import static org.junit.Assert.*;

import org.junit.Test;



public class MainTest {

	@Test
	public void checkContinue() {
		Inputparser parser = new Inputparser();
		boolean result = parser.checkInput("10 + 5");
		assertTrue(result);
	}
	
	@Test
	public void checkWrongFormat() {
		Inputparser parser = new Inputparser();
		boolean result = parser.checkInput("10 +5");
		assertFalse(result);
	}
	
	@Test
	public void checkDiscontinue() {
		Inputparser parser = new Inputparser();
		boolean result = parser.checkInput("x");
		assertFalse(result);
	}
	
	@Test
	public void checkCountWhiteSpace() {
		Inputparser parser = new Inputparser();
		int amount = parser.countWhitespace("10 + 5");
		assertTrue("countWhiteSpace wrong", amount - 2 == 0);
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
	
	@Test
	public void checkAdd() {
		Operations add = new Operations();
		double answer = add.add(10, 5);
		assertTrue("add logic fail", answer == 15);
	}
	
	@Test
	public void checkSubtract() {
		Operations sub = new Operations();
		double answer = sub.subtract(10, 5);
		assertTrue("subtract logic fail", answer == 5);
	}
	
	@Test
	public void checkMultiply() {
		Operations multi = new Operations();
		double answer = multi.multiply(10,5);
		assertTrue("multiply logic fail", answer == 50);
	}
	
	@Test
	public void checkDivide() {
		Operations divide = new Operations();
		double answer = divide.divide(10, 5);
		assertTrue("divide logic fail", answer == 2);
	}
	
	@Test
	public void checkDivideZero() {
		Operations divide = new Operations();
		double answer = divide.divide(10, 0);
		assertTrue("divide logic fail", answer == 0);
	}
	
	@Test
	public void checkMod() {
		Operations mod = new Operations();
		double answer = mod.mod(10,5);
		assertTrue("mod logic fail", answer == 0);
	}
	
	@Test
	public void checkOperatorAdd() {
		Operations operator = new Operations();
		Equation testEquation = new Equation();
		testEquation.setFirst(10);
		testEquation.setOprand("+");
		testEquation.setSecond(5);
		double answer = operator.compute(testEquation);
		assertTrue("add and operator fail", answer == 15);
	}
	
	@Test
	public void checkOperatorSub() {
		Operations operator = new Operations();
		Equation testEquation = new Equation();
		testEquation.setFirst(10);
		testEquation.setOprand("-");
		testEquation.setSecond(5);
		double answer = operator.compute(testEquation);
		assertTrue("sub and operator fail", answer == 5);
	}
	
	@Test
	public void checkOperatorMul() {
		Operations operator = new Operations();
		Equation testEquation = new Equation();
		testEquation.setFirst(10);
		testEquation.setOprand("*");
		testEquation.setSecond(5);
		double answer = operator.compute(testEquation);
		assertTrue("mul and operator fail", answer == 50);
	}
	
	@Test
	public void checkOperatorDiv() {
		Operations operator = new Operations();
		Equation testEquation = new Equation();
		testEquation.setFirst(10);
		testEquation.setOprand("/");
		testEquation.setSecond(5);
		double answer = operator.compute(testEquation);
		assertTrue("Div and operator fail", answer == 2);
	}
	
	@Test
	public void checkOperatorMod() {
		Operations operator = new Operations();
		Equation testEquation = new Equation();
		testEquation.setFirst(10);
		testEquation.setOprand("%");
		testEquation.setSecond(5);
		double answer = operator.compute(testEquation);
		assertTrue("Mod and operator fail", answer == 0);
	}
}
