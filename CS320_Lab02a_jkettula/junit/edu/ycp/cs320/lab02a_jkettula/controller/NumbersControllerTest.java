package edu.ycp.cs320.lab02a_jkettula.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ycp.cs320.lab02a_jkettula.controller.NumbersController;
import edu.ycp.cs320.lab02a_jkettula.model.Numbers;
public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	private double first, second, third;
	private double result;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void setUp() {
		model = new Numbers();
		controller = new NumbersController();
		
		controller.setModel(model);
	}
	
	@Test
	public void testAdd() {
		
		model.setFirst(1);
		model.setSecond(1);
		model.setThird(1);
		
		first = model.getFirst();
		second = model.getSecond();
		third = model.getThird();
		
		result = controller.add(first, second, third);
		
		assertEquals(3, result);
	}
	
	
	
}
