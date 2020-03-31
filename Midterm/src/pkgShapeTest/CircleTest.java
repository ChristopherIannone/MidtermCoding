package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;

public class CircleTest {

	@Test
	public void CircleTest() {
		
		Circle circ1 = new Circle(10);
		
		assertEquals(314.5, circ1.area(), 0.01);
	}

}
