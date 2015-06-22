import static org.junit.Assert.*;

import org.junit.Test;


public class TestDirectionNorth
{
	@Test
	public void testDirectionNorth_Left_DirectionWest()
	{
		IDirection direction = new DirectionNorth();
		
		IDirection newDirection = direction.left();
		
		org.junit.Assert.assertEquals("Direction Should be WEST", "WEST", newDirection.name());
	}

	@Test
	public void testDirectionNorth_Right_DirectionEast()
	{
		IDirection direction = new DirectionNorth();
		
		IDirection newDirection = direction.right();
		
		org.junit.Assert.assertEquals("Direction Should be EAST", "EAST", newDirection.name());
	}
}