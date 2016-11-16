package tdd.training.tests;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.*;

import tdd.training.session1.Coordinates;
import tdd.training.session1.MarsRover;
import tdd.training.session1.Obstacle;

public class MarsRoverTest {

	private MarsRover rover;
	private Coordinates coordinates = new Coordinates(5, 3);
	
	private Obstacle obs;
	
 
	
	
	@Test
	public void getCoordinates() {
		assertEquals(coordinates.getX_coordinate(),5);
		assertEquals(coordinates.getY_coordinate(), 3);
	}

}
