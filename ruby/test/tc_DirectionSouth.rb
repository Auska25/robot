require_relative "../src/DirectionSouth.rb"
require "test/unit"

class TestDirectionSouth < Test::Unit::TestCase
    
  def test_name
    south = DirectionSouth.new()
    assert_equal("SOUTH", south.name())
  end
  
  def test_left
    direction = DirectionSouth.new()
    assert_equal("SOUTH", direction.name())
    direction = direction.left()
    assert_equal("EAST", direction.name())
  end
  
  def test_right
    direction = DirectionSouth.new()
    assert_equal("SOUTH", direction.name())
    direction = direction.right()
    assert_equal("WEST", direction.name())
  end
  
  def test_move_minNothing
    direction = DirectionSouth.new()
    position = Position.new(0,4,0,4)
    position.setPosition(0,0)
  
    position = direction.move(position)
    
    assert_equal(0, position.x_position)
    assert_equal(0, position.y_position)
  end
  
  def test_move_maxDown
    direction = DirectionSouth.new()
    position = Position.new(0,4,0,4)
    position.setPosition(0,4)
    
    position = direction.move(position)
    
    assert_equal(0, position.x_position)
    assert_equal(3, position.y_position)
  end
end
