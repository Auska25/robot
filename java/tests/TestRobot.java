import org.junit.Before;
import org.junit.Test;


public class TestRobot
{
	private Robot robot;
	
	@Before
	public void setUp() throws Exception
	{
		robot = new Robot(0,4,0,4);
	}

	@Test
	public void test_example_a()
	{
		robot.place( 0,0,DirectionKind.NORTH);
	    robot.move();
	    org.junit.Assert.assertEquals("0,1,NORTH", robot.report());
	}
	
	@Test
	public void test_example_b()
	{
		robot.place( 0,0,DirectionKind.NORTH);
	    robot.left();
		org.junit.Assert.assertEquals("0,0,WEST", robot.report());
	}
	
	@Test
	public void test_example_c()
	{
		robot.place(1,2,DirectionKind.EAST);
		robot.move();
		robot.move();
		robot.left();
		robot.move();
    	org.junit.Assert.assertEquals("3,3,NORTH", robot.report());
	}
}
