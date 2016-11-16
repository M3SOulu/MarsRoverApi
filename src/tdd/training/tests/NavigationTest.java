package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.training.session1.MarsRoverException;
import tdd.training.session1.Navigation;

public class NavigationTest {
	//Act
	Navigation navTest = new Navigation(5, 5, "?(1,2)(3,5)?");
	
	@Test (expected = MarsRoverException.class)
	public void testGeneraOstacoli() {
		assertEquals(2, navTest.getObstacles().size());
		assertEquals("12", navTest.getObstacles().get(0));
	}

}
