require_relative "../src/DirectionWest.rb"
gem 'test-unit'
require "test/unit"

class TestDirectionWest < Test::Unit::TestCase
    
  def test_name
    west = DirectionWest.new()
    assert_equal("WEST", west.name())
  end
  
end
