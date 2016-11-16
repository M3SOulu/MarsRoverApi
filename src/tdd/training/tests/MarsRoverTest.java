package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.Car;
import tdd.training.session1.MarsRover;

public class MarsRoverTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	public void testCommand1(){
		Car Car= new Car();
		MarsRover Rover = new MarsRover(3,3,"");
		Car.x=1;
		Car.y=1;
		
		Rover.executeCommand("fb");
		
		assertEquals(Car.x,1);
	}
	public void testCommand2(){
		Car Car= new Car();
		MarsRover Rover = new MarsRover(3,3,"");
		Car.x=1;
		Car.y=1;
		
		Rover.executeCommand("fbff");
		
		assertEquals(Car.y,2);		
	}
	public void testCommand3(){
		Car Car= new Car();
		MarsRover Rover = new MarsRover(3,3,"");
		Car.x=1;
		Car.y=1;
		
		Rover.executeCommand("fbffr");
		
		assertEquals(Car.x,2);		
	}
}
