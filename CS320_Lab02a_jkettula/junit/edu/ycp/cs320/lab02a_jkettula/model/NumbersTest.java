package edu.ycp.cs320.lab02a_jkettula.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_jkettula.model.Numbers;
public class NumbersTest {
	
	private Numbers model;
	private double result;
	
	public void setUp() {
		model = new Numbers();
	}
	
	@Test
	public void testSetFirst() {
		model.setFirst(5);
		assertEquals(5,model.getFirst());
		
	}
	
	@Test
	public void testSetSecond() {
		model.setSecond(10);
		assertEquals(10,model.getSecond());
		
	}
	@Test
	public void testSetThird() {
		model.setThird(3);
		assertEquals(3,model.getThird());
	}
	
	@Test
	public void testAdd() {
		
		model.setFirst(1);
		model.setSecond(1);
		model.setThird(1);
		result = model.getFirst() + model.getSecond() + model.getThird();
		
		model.setResult(result);
		
		assertEquals(result, 3);
	}
	
}
