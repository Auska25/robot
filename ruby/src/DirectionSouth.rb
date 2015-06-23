require_relative "IDirection.rb"
require_relative "DirectionWest.rb"
require_relative "DirectionEast.rb"

class DirectionSouth < IDirection
  
  def name()
    return "SOUTH"
  end
  
  def left()
    return DirectionEast.new()
  end
  
  def right()
    return DirectionWest.new()
  end
end