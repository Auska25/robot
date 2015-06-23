require_relative "IDirection.rb"
require_relative "DirectionNorth.rb"
require_relative "DirectionSouth.rb"

class DirectionEast < IDirection
  
  def name()
    return "EAST"
  end
  
  def left()
    return DirectionNorth.new()
  end
  
  def right()
    return DirectionSouth.new()
  end
  
end