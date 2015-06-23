require_relative "../src/DirectionNorth.rb"
require "test/unit"

class TestDirectionNorth < Test::Unit::TestCase
    
  def test_name
    north = DirectionNorth.new()
    assert_equal("NORTH", north.name())
  end
  
  def test_left
    direction = DirectionNorth.new()
    assert_equal("NORTH", direction.name())
    direction = direction.left()
    assert_equal("WEST", direction.name())
  end
  
  def test_right
    direction = DirectionNorth.new()
    assert_equal("NORTH", direction.name())
    direction = direction.right()
    assert_equal("EAST", direction.name())
  end
  
  def test_move_minUp
    direction = DirectionNorth.new()
    position = Position.new(0,4,0,4)
    position.setPosition(0,0)
  
    position = direction.move(position)
    
    assert_equal(0, position.x_position)
    assert_equal(1, position.y_position)
  end
  
  def test_move_maxNothing
    direction = DirectionNorth.new()
    position = Position.new(0,4,0,4)
    position.setPosition(0,4)
    
    position = direction.move(position)
    
    assert_equal(0, position.x_position)
    assert_equal(4, position.y_position)
  end
end
