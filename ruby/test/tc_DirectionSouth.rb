require_relative "../src/DirectionSouth.rb"
require "test/unit"

class TestDirectionSouth < Test::Unit::TestCase
    
  def test_name
    south = DirectionSouth.new()
    assert_equal("SOUTH", south.name())
  end
  
end
