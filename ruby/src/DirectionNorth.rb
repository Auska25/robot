require_relative "IDirection.rb"
require_relative "DirectionWest.rb"
require_relative "DirectionEast.rb"

class DirectionNorth < IDirection
  
  def name()
    return "NORTH"
  end
  
  def left()
    return DirectionWest.new()
  end
  
  def right()
    return DirectionEast.new()
  end
end