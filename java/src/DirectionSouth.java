
public class DirectionSouth implements IDirection
{
	public IDirection left()
	{
		return new DirectionEast();
	}
	
	public IDirection right()
	{
		return new DirectionWest();
	}
	
	public Position move(Position position)
	{
		position.setYPosition(position.getYPosition() - 1 );
		return position;
	}

	public String name()
	{
		return "SOUTH";
	}
}
