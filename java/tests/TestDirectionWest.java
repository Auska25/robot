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
	
	@Test
	public void testDirectionWest_Move_MinNothing()
	{
		IDirection direction = new DirectionWest();
		Position position = new Position(0, 4, 0, 4);
		position.setXPosition(0);
		position.setYPosition(0);
		
		position = direction.move(position);
		
		org.junit.Assert.assertEquals(0, position.getXPosition());
		org.junit.Assert.assertEquals(0, position.getYPosition());
	}
	
	@Test
	public void testDirectionWest_Move_MaxLeft()
	{
		IDirection direction = new DirectionWest();
		Position position = new Position(0, 4, 0, 4);
		position.setXPosition(4);
		position.setYPosition(0);
		
		position = direction.move(position);
		
		org.junit.Assert.assertEquals(3, position.getXPosition());
		org.junit.Assert.assertEquals(0, position.getYPosition());
	}
}