
public class DirectionEast implements IDirection
{
	public IDirection left()
	{
		return new DirectionNorth();
	}
	
	public IDirection right()
	{
		return new DirectionSouth();
	}
	
	public Position move(Position position)
	{
		return position;
	}

	public String name()
	{
		return "EAST";
	}
}