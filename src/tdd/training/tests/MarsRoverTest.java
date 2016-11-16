package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.*;

public class MarsRoverTest {



	@Test
	public void test() {}

	public void testCommand1(){
		Rover Car= new Rover();
		MarsRover Rover = new MarsRover(4,3,"");
		Car.x=1;
		Car.y=1;

		Rover.executeCommand("fbffrrb");

		assertEquals(Car.x,3);
		assertEquals(Car.y,2);
	}
	public void testCommand2(){
		Rover Car= new Rover();
		MarsRover Rover = new MarsRover(3,3,"");
		Car.x=1;
		Car.y=1;

		Rover.executeCommand("bff");

		assertEquals(Car.y,2);
		assertEquals(Car.x,0);
	}
	public void testCommand3(){
		Rover Car= new Rover();
		MarsRover Rover = new MarsRover(3,3,"");
		Car.x=1;
		Car.y=1;

		Rover.executeCommand("fbffr");

		assertEquals(Car.x,2);		

	}
}

	

