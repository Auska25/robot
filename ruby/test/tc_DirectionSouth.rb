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
end
