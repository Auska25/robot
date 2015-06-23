require_relative "../src/DirectionEast.rb"
require_relative "../src/Position.rb"
require "test/unit"

class TestDirectionEast < Test::Unit::TestCase
    
  def test_name
    east = DirectionEast.new()
    assert_equal("EAST", east.name())
  end
  
  def test_left
    direction = DirectionEast.new()
    assert_equal("EAST", direction.name())
    direction = direction.left()
    assert_equal("NORTH", direction.name())
  end
  
  def test_right
    direction = DirectionEast.new()
    assert_equal("EAST", direction.name())
    direction = direction.right()
    assert_equal("SOUTH", direction.name())
  end
  
  def test_move_minRight
    direction = DirectionEast.new()
    position = Position.new(0,4,0,4)
    position.setPosition(0,0)
  
    position = direction.move(position)
    
    assert_equal(1, position.x_position)
    assert_equal(0, position.y_position)
  end
  
  def test_move_maxNothing
    direction = DirectionEast.new()
    position = Position.new(0,4,0,4)
    position.setPosition(4,0)
  
    assert_equal(4, position.x_position)
    assert_equal(0, position.y_position)
    
    position = direction.move(position)
    
    assert_equal(4, position.x_position)
    assert_equal(0, position.y_position)
  end
end
