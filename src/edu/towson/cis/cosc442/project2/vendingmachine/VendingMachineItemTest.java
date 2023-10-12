package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {
	
	VendingMachineItem example;

	@Before
	public void setUp() throws Exception {
		//initialize the Vending Machine Item
		example = new VendingMachineItem("soda",1.50);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVendingMachineItem() {
		//initialize the Vending Machine Item 
		//and check if price and name match with getName and getPrice
		example = new VendingMachineItem("water",2.50);
		
		String exName = "water";
		
		double exPrice = 2.50;
		
		assertEquals(exName, example.getName());
		assertEquals(exPrice, example.getPrice(), 0.1);
	}

	@Test
	public void testGetName() {
		//check if getName matches constructor name
		String exName = "soda";
		assertEquals(exName, example.getName());
	}

	@Test
	public void testGetPrice() {
		//check if getPrice matches constructor price
		double exPrice = 1.50;
		
		assertEquals(exPrice, example.getPrice(), 0.1);
	}

}
