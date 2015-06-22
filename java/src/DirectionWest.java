
public class DirectionWest implements IDirection
{
	public IDirection left()
	{
		return new DirectionSouth();
	}
	
	public IDirection right()
	{
		return new DirectionNorth();
	}
	
	public Position move(Position position)
	{
		position.setXPosition(position.getXPosition() - 1 );
		return position;
	}

	public String name()
	{
		return "WEST";
	}
}