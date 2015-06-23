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
end
