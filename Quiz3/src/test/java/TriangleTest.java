import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	//getArea() tests
	@Test
	public void testArea() {
		Triangle test = new Triangle(3.0, 4.0, 5.0);
		double ExpectedResult = 6.0;
		double ActualResult = test.getArea();
		assertEquals(ExpectedResult, ActualResult, 0.01);
	
	}
	
	@Test
	public void testArea2() {
		Triangle test = new Triangle(36.0, 48.0, 60.0);
		double ExpectedResult = 864.0;
		double ActualResult = test.getArea();
		assertEquals(ExpectedResult, ActualResult, 0.01);
	}

	//getPerimeter() tests 
	@Test
	public void testPerimeter() {
		Triangle test = new Triangle(3.0, 4.0, 5.0);
		double ExpectedResult = 12;
		double ActualResult = test.getPerimeter();
		assertEquals(ExpectedResult, ActualResult, 0.01);
	}
	
	@Test
	public void testPerimeter2() {
		Triangle test = new Triangle(36.0, 48.0, 60.0);
		double ExpectedResult = 144.0;
		double ActualResult = test.getPerimeter();
		assertEquals(ExpectedResult, ActualResult, 0.01);
	}
	
	
}
