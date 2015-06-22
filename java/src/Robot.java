
public class Robot
{
	private Position 	position;
	private IDirection 	direction;
	private boolean		is_placed = false;
	
	public Robot(int min_x, int max_x, int min_y, int max_y)
	{
		position = new Position(min_x, max_x, min_y, max_y);
	}
	
	public void move()
	{
		if( is_placed )
		{
			position = direction.move(position);
		}
	}
	
	public void left()
	{
		if( is_placed )
		{
			direction = direction.left();
		}
	}
	
	public void right()
	{
		if( is_placed )
		{
			direction = direction.right();
		}
	}
	
	public void report()
	{
		if( !is_placed )
		{
			System.out.println("ROBOT HASN'T BE PLACED SUCCESSFULLY");
		}
		else
		{
			System.out.println(position.getXPosition() + "," + position.getYPosition() + "," + direction.name());
		}
	}
	
	public void place(int x, int y, DirectionKind direction)
	{
		is_placed = position.setPosition(x, y);
		
		switch(direction)
		{
		case NORTH:	this.direction = new DirectionNorth();	break;
		case SOUTH: this.direction = new DirectionSouth(); 	break;
		case EAST: 	this.direction = new DirectionEast(); 	break;
		case WEST: 	this.direction = new DirectionWest(); 	break;
		}
	}
}
