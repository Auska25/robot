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
end
