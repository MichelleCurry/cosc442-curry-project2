package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	VendingMachine v;
	VendingMachineItem item;

	@Before
	public void setUp() throws Exception {
		//initialize the Vending Machine with Vending Machine Item
		v = new VendingMachine();
		item = new VendingMachineItem("chips", 1.50);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddItem() { 
		//Add item and check if there with getItem
		v.addItem(item, "A");
		assertEquals(item, v.getItem("A"));
	}

	@Test
	public void testRemoveItem() {
		//add item to then remove, check if item null
		v.addItem(item, "A");
		v.removeItem("A");
		assertEquals(null, v.getItem("A"));
	}

	@Test
	public void testInsertMoney() {
		//insert money then check if balance equal to deposit
		v.insertMoney(1.50);
		assertEquals(1.50, v.getBalance(), 0.01);
	}

	@Test
	public void testGetBalance() {
		//don't add anything and check if balance 0 (minimize functions called)
		assertEquals(0, v.getBalance(), 0.01);
	}

	@Test
	public void testMakePurchase() {
		//make sure to add item, money before purchasing then check if item gone after purchasing
		v.addItem(item, "A");
		v.insertMoney(1.50);
		v.makePurchase("A");
		assertEquals(null, v.getItem("A"));
		
	}

	@Test
	public void testReturnChange() {
		//check if balance 0 after initially inserting money then returning change
		v.insertMoney(1.50);
		v.returnChange();
		assertEquals(0, v.getBalance(), 0.01);
	}

}