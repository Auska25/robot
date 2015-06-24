class Position
  @MIN_X_POSITION
  @MAX_X_POSITION
  @MIN_Y_POSITION
  @MAX_Y_POSITION
  
  @x_position = 0
  @y_position = 0
  
  def initialize(min_x, max_x, min_y, max_y)
    @MIN_X_POSITION = min_x
    @MAX_X_POSITION = max_x
    @MIN_Y_POSITION = min_y
    @MAX_Y_POSITION = max_y
  end
  
  def x_position
    return @x_position
  end
  
  def x_position=(x)
    if( x >= @MIN_X_POSITION && x <= @MAX_X_POSITION)
      @x_position = x
      return true
    end
    return false
  end
  
  def y_position
    return @y_position
  end
  
  def y_position=(y)
    if( y >= @MIN_Y_POSITION && y <= @MAX_Y_POSITION)
      @y_position = y
      return true
    end
    return false
  end
  
  def setPosition(x, y)
    self.x_position = x
    self.y_position = y
    return @x_position && @y_position
  end
end
