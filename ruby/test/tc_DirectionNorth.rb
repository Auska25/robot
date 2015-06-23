require_relative "../src/DirectionNorth.rb"
require "test/unit"

class TestDirectionNorth < Test::Unit::TestCase
    
  def test_name
    north = DirectionNorth.new()
    assert_equal("NORTH", north.name())
  end
  
end
