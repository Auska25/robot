
public interface IDirection
{
	IDirection left();
	
	IDirection right();
	
	Position move(Position position);

	String name();
}
