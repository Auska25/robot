
public class DirectionSouth implements IDirection
{
	public IDirection left()
	{
		return null;
	}
	
	public IDirection right()
	{
		return null;
	}
	
	public Position move(Position position)
	{
		return position;
	}

	public String name()
	{
		return "SOUTH";
	}
}
