import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestPosition {

	Position position;
	
	@Before
	public void setUp() throws Exception
	{
		position = new Position(0, 4, 0, 4);
	}

	@Test
	public void testPosition_setXPosition()
	{
		position.setXPosition(1);
		org.junit.Assert.assertEquals(1, position.getXPosition());
		
		position.setXPosition(-1);
		org.junit.Assert.assertEquals(1, position.getXPosition());
		
		position.setXPosition(0);
		org.junit.Assert.assertEquals(0, position.getXPosition());
		
		position.setXPosition(4);
		org.junit.Assert.assertEquals(4, position.getXPosition());
		
		position.setXPosition(5);
		org.junit.Assert.assertEquals(4, position.getXPosition());
	}

	@Test
	public void testPosition_setYPosition()
	{
		position.setYPosition(1);
		org.junit.Assert.assertEquals(1, position.getYPosition());
		
		position.setYPosition(-1);
		org.junit.Assert.assertEquals(1, position.getYPosition());
		
		position.setYPosition(0);
		org.junit.Assert.assertEquals(0, position.getYPosition());
		
		position.setYPosition(4);
		org.junit.Assert.assertEquals(4, position.getYPosition());
		
		position.setYPosition(5);
		org.junit.Assert.assertEquals(4, position.getYPosition());
	}
}
