package test;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import cart.ShoppingCart;
import category.ItemCategory;
import customer.UnRegisteredCustomer;
import item.ConcreteProduct;
import payment.ConcretePayment;
import payment.Payment;

public class ConcretePaymentTest {
	private Payment payment;
	private ShoppingCart shoppingCart;

	@Before
	public void setUp() {
		shoppingCart = new ShoppingCart(new UnRegisteredCustomer("DA","M","1944-09-03"));
		shoppingCart.addToCart(new ConcreteProduct("Ten - Pearl Jam - 1991",  new ItemCategory("CD e Vinili"),7.50),1);

		payment = new ConcretePayment(shoppingCart.getTotalPrice());
	}

	@Test
	public void testBankTransfer() {
		payment.doPay();
		assertEquals("7.5",payment.getPay());
	}
}
