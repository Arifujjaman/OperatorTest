package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.OperatorTestClass;

public class OperatorTest {
	OperatorTestClass oT=new OperatorTestClass();
	@Test
	public void test() {
		assertEquals(5,oT.addition(2,3));
		assertEquals(-1,oT.subtruction(2,3));
		assertEquals(0,oT.division(2,3));
		assertEquals(6,oT.multiplication(2,3));
		assertEquals(2,oT.modulas(2,3));
		
		assertEquals(-3,oT.bitNot(2));
		assertEquals(2,oT.bitAnd(7,2));
		assertEquals(7,oT.bitOr(7,2));
		assertEquals(5,oT.bitExOr(7,2));
		assertEquals(6,oT.bitShiftRight(12));
		assertEquals(14,oT.bitShiftLeft(7));
		assertEquals(12,oT.bitShiftRightZero(12));
		assertEquals(12,oT.bitShiftLeftZero(12));
		
		assertEquals(true,oT.Equalto(12,12));
		assertEquals(true,oT.notEqualto(14,12));
		assertEquals(true,oT.Greaterthan(14,12));
		assertEquals(true,oT.Lessthan(10,12));
		
	}

}