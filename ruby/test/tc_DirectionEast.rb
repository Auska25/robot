require_relative "../src/DirectionEast.rb"
require "test/unit"

class TestDirectionEast < Test::Unit::TestCase
    
  def test_name
    east = DirectionEast.new()
    assert_equal("EAST", east.name())
  end
  
end