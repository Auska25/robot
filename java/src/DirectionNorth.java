
public class DirectionNorth implements IDirection
{
	public IDirection left()
	{
		return new DirectionWest();
	}
	
	public IDirection right()
	{
		return new DirectionEast();
	}
	
	public Position move(Position position)
	{
		position.setYPosition(position.getYPosition() + 1 );
		return position;
	}

	public String name()
	{
		return "NORTH";
	}
}
