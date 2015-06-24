require_relative "Position.rb"
require_relative "DirectionEast.rb"
require_relative "DirectionNorth.rb"
require_relative "DirectionSouth.rb"
require_relative "DirectionWest.rb"

class Robot
  @position
  @direction
  @is_placed
  
  def initialize(min_x, max_x, min_y, max_y)
    @position = Position.new(min_x,max_x,min_y,max_y)
    @is_placed = false
  end
  
  def left()
    if( @is_placed )
      @direction = @direction.left()
    end
  end
  
  def right()
    if( @is_placed )
      @direction = @direction.right()
    end
  end
  
  def move()
    if( @is_placed )
      @position = @direction.move(@position)
    end
  end
  
  def report()
    if( !@is_placed )
      return "ROBOT HASN'T BE PLACED SUCCESSFULLY"
    else
      return "#{@position.x_position},#{@position.y_position},#{@direction.name()}"
    end
  end
  
  def place(x, y, direction)
    @is_placed = @position.setPosition(x,y)
    
    if( direction == "NORTH" )
      @direction = DirectionNorth.new()
    elsif( direction == "SOUTH")
      @direction = DirectionSouth.new()
    elsif( direction == "EAST")
      @direction = DirectionEast.new()
    elsif( direction == "WEST")
      @direction = DirectionWest.new()
    else
      return false
    end
  end
end
