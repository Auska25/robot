import static org.junit.Assert.*;

import org.junit.Test;


public class TestDirectionWest
{
	@Test
	public void testDirectionWest_Left_DirectionSouth()
	{
		IDirection direction = new DirectionWest();
		
		IDirection newDirection = direction.left();
		
		org.junit.Assert.assertEquals("Direction Should be SOUTH", "SOUTH", newDirection.name());
	}

	@Test
	public void testDirectionWest_Right_DirectionNorth()
	{
		IDirection direction = new DirectionWest();
		
		IDirection newDirection = direction.right();
		
		org.junit.Assert.assertEquals("Direction Should be NORTH", "NORTH", newDirection.name());
	}
}