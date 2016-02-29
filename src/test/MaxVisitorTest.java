package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import category.ItemCategory;
import item.ConcreteProduct;
import report.MaxVisitor;

public class MaxVisitorTest {
	private MaxVisitor max;
	private ConcreteProduct product1;
	private ConcreteProduct product2;

	@Before
	public void setUp() {
		max = new MaxVisitor();

		product1 = new ConcreteProduct("The Joshua Tree - U2 - 1987",  new ItemCategory("CD e Vinili"), 14.99);
		product2 = new ConcreteProduct("War - U2 - 1983",  new ItemCategory("CD e Vinili"), 11.55);
	}

	@Test
	public void testMax() {
		assertEquals(max.evaluate(product1, product2), true);
	}
}

