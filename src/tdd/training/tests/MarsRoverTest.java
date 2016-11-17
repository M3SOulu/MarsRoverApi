package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import tdd.training.session1.MarsRover;

public class MarsRoverTest {
	
	
	
	@Test
	public void testNLimit1() {
		MarsRover mrs = new MarsRover(3,3,null);
		mrs.executeCommand("ff");
		assertEquals("(0,0,N)", mrs.executeCommand("f"));
	}
	
	@Test
	public void testNLimit2() {
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(0,2,N)", mrs.executeCommand("b"));
	}
	
	@Test
	public void testN1() {
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(0,1,N)", mrs.executeCommand("f"));
	}
	
	@Test
	public void testSLimit1() {
		MarsRover mrs = new MarsRover(3,3,null);
		mrs.executeCommand("lff");
		assertEquals("(0,0,S)", mrs.executeCommand("f"));
	}
	
	@Test
	public void testSLimit2() {
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(0,2,S)", mrs.executeCommand("lbb"));
	}
	
	@Test
	public void testS() {
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(0,2,S)", mrs.executeCommand("lf"));
	}
	
	@Test
	public void testELimit1() {
		MarsRover mrs = new MarsRover(3,3,null);
		
		assertEquals("(2,0,E)", mrs.executeCommand("rb"));
	}
	
	@Test
	public void testELimit2() {
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(0,0,E)", mrs.executeCommand("rfff"));
	}
	
	@Test
	public void testE1() {
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(1,0,E)", mrs.executeCommand("rf"));
	}

	@Test
	public void testWLimit1() {
		MarsRover mrs = new MarsRover(3,3,null);
		
		assertEquals("(2,0,W)", mrs.executeCommand("lrf"));
	}
	
	@Test
	public void testWLimit2() {
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(0,0,W)", mrs.executeCommand("lrbbb"));
	}
	
	@Test
	public void testW1() {
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(1,0,W)", mrs.executeCommand("lrb"));
	}

	@Test
	public void testExample(){
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(0,2,E)", mrs.executeCommand("ffrfff"));
	}
	
	@Test
	public void testExample2(){
		MarsRover mrs = new MarsRover(3,3,null);
		assertEquals("(1,2,E)", mrs.executeCommand("ffrf"));
	}
	
	@Test
	public void testObstacoles(){
		MarsRover mrs = new MarsRover(3,3,"(1,1)");
		assertEquals(-1, mrs.getGrid()[1][1]);
	}
	
	@Test
	public void testObstacoles1(){
		MarsRover mrs = new MarsRover(3,3,"(0,2)");
		assertEquals("(1,1,E)(0,2)", mrs.executeCommand("ffrf"));
	}
	
	
	
}
