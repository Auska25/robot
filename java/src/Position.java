
public class Position
{
	private final int MIN_X_POSITION;
	private final int MAX_X_POSITION;
	private final int MIN_Y_POSITION;
	private final int MAX_Y_POSITION;
	
	private int x_position = 0;
	private int y_position = 0;
	
	public Position(int min_x, int max_x, int min_y, int max_y)
	{
		MIN_X_POSITION = min_x;
		MAX_X_POSITION = max_x;
		MIN_Y_POSITION = min_y;
		MAX_Y_POSITION = max_y;
	}
	
	public int getXPosition()
	{
		return x_position;
	}
	
	public boolean setXPosition(int x_position)
	{
		if(x_position >= MIN_X_POSITION && x_position <= MAX_X_POSITION)
		{
			this.x_position = x_position;
			return true;
		}
		return false;
	}
	
	public int getYPosition()
	{
		return y_position;
	}
	
	public boolean setYPosition(int y_position)
	{
		if(y_position >= MIN_Y_POSITION && y_position <= MAX_Y_POSITION)
		{
			this.y_position = y_position;
			return true;
		}
		return false;
	}
	
	public boolean setPosition(int x, int y)
	{
		return ( setXPosition(x) && setYPosition(y) );
	}
}
