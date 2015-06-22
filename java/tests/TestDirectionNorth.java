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
	
	@Test
	public void testDirectionNorth_Move_MinUp()
	{
		IDirection direction = new DirectionNorth();
		Position position = new Position(0, 4, 0, 4);
		position.setXPosition(0);
		position.setYPosition(0);
		
		position = direction.move(position);
		
		org.junit.Assert.assertEquals(0, position.getXPosition());
		org.junit.Assert.assertEquals(1, position.getYPosition());
	}
	
	@Test
	public void testDirectionNorth_Move_MaxNothing()
	{
		IDirection direction = new DirectionNorth();
		Position position = new Position(0, 4, 0, 4);
		position.setXPosition(0);
		position.setYPosition(4);
		
		position = direction.move(position);
		
		org.junit.Assert.assertEquals(0, position.getXPosition());
		org.junit.Assert.assertEquals(4, position.getYPosition());
	}
}