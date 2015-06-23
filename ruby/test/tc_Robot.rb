require_relative "../src/Robot.rb"
require "test/unit"

class TestRobot < Test::Unit::TestCase
  
  def test_example_a
    robot = Robot.new(0,4,0,4)
    robot.place(0,0,"NORTH")
    robot.move()
    assert_equal("0,1,NORTH", robot.report())
  end
  
  def test_example_b
    robot = Robot.new(0,4,0,4)
    robot.place(0,0,"NORTH")
    robot.left()
    assert_equal("0,0,WEST", robot.report())
  end
  
  def test_example_c
    robot = Robot.new(0,4,0,4)
    robot.place(1,2,"EAST")
    robot.move()
    assert_equal("2,2,EAST", robot.report())
    robot.move()
    assert_equal("3,2,EAST", robot.report())
    robot.left()
    assert_equal("3,2,NORTH", robot.report())
    robot.move()
    assert_equal("3,3,NORTH", robot.report())
  end
end
