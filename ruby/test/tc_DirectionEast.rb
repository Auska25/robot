require_relative "../src/DirectionEast.rb"
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
end
