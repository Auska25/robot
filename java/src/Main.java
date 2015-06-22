import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main
{
	public static void main(String[] args)
	{
		System.out.println("SYSTEM START");
		
		Robot robot = new Robot(0,4,0,4); // 5x5 square
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			String in = scanner.nextLine();
			
			if( in.matches("PLACE [0-9]+,[0-9]+,((NORTH)|(SOUTH)|(EAST)|(WEST))"))
			{				
				Matcher matcher = Pattern.compile("\\d+").matcher(in);
				matcher.find();
				int x = Integer.valueOf(matcher.group());
				matcher.find();
				int y = Integer.valueOf(matcher.group());
				
				DirectionKind direction;
				if(in.contains("NORTH"))
				{
					direction = DirectionKind.NORTH;
				}
				else if(in.contains("SOUTH"))
				{
					direction = DirectionKind.SOUTH;
				}
				else if(in.contains("EAST"))
				{
					direction = DirectionKind.EAST;
				}
				else
				{
					direction = DirectionKind.WEST;
				}
				
				robot.place(x, y, direction);
			}
			else if( in.equals("LEFT") )
			{
				robot.left();
			}
			else if( in.equals("RIGHT") )
			{
				robot.right();
			}
			else if( in.equals("MOVE") )
			{
				robot.move();
			}
			else if( in.equals("REPORT") )
			{
				System.out.println(robot.report());
			}
		}
	}
}
