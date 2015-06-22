import static org.junit.Assert.*;

import org.junit.Test;


public class TestDirectionSouth
{
	@Test
	public void testDirectionSouth_Left_DirectionEast()
	{
		IDirection direction = new DirectionSouth();
		
		IDirection newDirection = direction.left();
		
		org.junit.Assert.assertEquals("Direction Should be EAST", "EAST", newDirection.name());
	}

	@Test
	public void testDirectionSouth_Right_DirectionWest()
	{
		IDirection direction = new DirectionSouth();
		
		IDirection newDirection = direction.right();
		
		org.junit.Assert.assertEquals("Direction Should be WEST", "WEST", newDirection.name());
	}
}