require_relative "../src/DirectionWest.rb"
gem 'test-unit'
require "test/unit"

class TestDirectionWest < Test::Unit::TestCase
    
  def test_name
    west = DirectionWest.new()
    assert_equal("WEST", west.name())
  end
  
  def test_left
    direction = DirectionWest.new()
    assert_equal("WEST", direction.name())
    direction = direction.left()
    assert_equal("SOUTH", direction.name())
  end
  
  def test_right
    direction = DirectionWest.new()
    assert_equal("WEST", direction.name())
    direction = direction.right()
    assert_equal("NORTH", direction.name())
  end
  
  def test_move_minNothing
    direction = DirectionWest.new()
    position = Position.new(0,4,0,4)
    position.setPosition(0,0)
  
    position = direction.move(position)
    
    assert_equal(0, position.x_position)
    assert_equal(0, position.y_position)
  end
  
  def test_move_maxLeft
    direction = DirectionWest.new()
    position = Position.new(0,4,0,4)
    position.setPosition(4,0)
  
    assert_equal(4, position.x_position)
    assert_equal(0, position.y_position)
    
    position = direction.move(position)
    
    assert_equal(3, position.x_position)
    assert_equal(0, position.y_position)
  end
end
