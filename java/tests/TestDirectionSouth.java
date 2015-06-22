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
	
	@Test
	public void testDirectionSouth_Move_MinNothing()
	{
		IDirection direction = new DirectionSouth();
		Position position = new Position(0, 4, 0, 4);
		position.setXPosition(0);
		position.setYPosition(0);
		
		position = direction.move(position);
		
		org.junit.Assert.assertEquals(0, position.getXPosition());
		org.junit.Assert.assertEquals(0, position.getYPosition());
	}
	
	@Test
	public void testDirectionSouth_Move_MaxDown()
	{
		IDirection direction = new DirectionSouth();
		Position position = new Position(0, 4, 0, 4);
		position.setXPosition(0);
		position.setYPosition(4);
		
		position = direction.move(position);
		
		org.junit.Assert.assertEquals(0, position.getXPosition());
		org.junit.Assert.assertEquals(3, position.getYPosition());
	}
}