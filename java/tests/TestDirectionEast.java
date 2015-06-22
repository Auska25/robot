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
	
	@Test
	public void testDirectionEast_Move_MinRight()
	{
		IDirection direction = new DirectionEast();
		Position position = new Position(0, 4, 0, 4);
		position.setXPosition(0);
		position.setYPosition(0);
		
		position = direction.move(position);
		
		org.junit.Assert.assertEquals(1, position.getXPosition());
		org.junit.Assert.assertEquals(0, position.getYPosition());
	}
	
	@Test
	public void testDirectionEast_Move_MaxNothing()
	{
		IDirection direction = new DirectionEast();
		Position position = new Position(0, 4, 0, 4);
		position.setXPosition(4);
		position.setYPosition(0);
		
		position = direction.move(position);
		
		org.junit.Assert.assertEquals(4, position.getXPosition());
		org.junit.Assert.assertEquals(0, position.getYPosition());
	}
}
