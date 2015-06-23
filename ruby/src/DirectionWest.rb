require_relative "IDirection.rb"
require_relative "DirectionNorth.rb"
require_relative "DirectionSouth.rb"

class DirectionWest < IDirection
  
  def name()
    return "WEST"
  end
  
  def left()
    return DirectionSouth.new()
  end
  
  def right()
    return DirectionNorth.new()
  end
  
  def move(position)
    position.x_position = position.x_position - 1
    return position
  end
end
