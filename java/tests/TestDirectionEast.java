import static org.junit.Assert.*;

import org.junit.Test;


public class TestDirectionEast
{
	@Test
	public void testDirectionEast_Left_DirectionNorth()
	{
		IDirection direction = new DirectionEast();
		
		IDirection newDirection = direction.left();
		
		org.junit.Assert.assertEquals("Direction Should be NORTH", "NORTH", newDirection.name());
	}

	@Test
	public void testDirectionEast_Right_DirectionSouth()
	{
		IDirection direction = new DirectionEast();
		
		IDirection newDirection = direction.right();
		
		org.junit.Assert.assertEquals("Direction Should be SOUTH", "SOUTH", newDirection.name());
	}
}
