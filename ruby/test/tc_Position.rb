require_relative "../src/Position.rb"
require "test/unit"

class TestPosition < Test::Unit::TestCase

  def test_setXPosition
    position = Position.new(0,4,0,4) # 5x5 grid
    
    position.x_position = 1
    assert_equal(1, position.x_position)
   
    position.x_position = -1
    assert_equal(1, position.x_position)
    
    position.x_position = 0
    assert_equal(0, position.x_position)
    
    position.x_position = 4
    assert_equal(4, position.x_position)

    position.x_position = 5
    assert_equal(4, position.x_position)    
  end  
  
  def test_setYPosition
    position = Position.new(0,4,0,4) # 5x5 grid
    
    position.y_position = 1
    assert_equal(1, position.y_position)
   
    position.y_position = -1
    assert_equal(1, position.y_position)
    
    position.y_position = 0
    assert_equal(0, position.y_position)
    
    position.y_position = 4
    assert_equal(4, position.y_position)

    position.y_position = 5
    assert_equal(4, position.y_position)    
  end  

end
