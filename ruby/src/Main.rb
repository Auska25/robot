require_relative "Robot"

puts "SYSTEM START"
$robot = Robot.new(0,4,0,4)

while true do
  
  inp = $stdin.gets.chomp
  
  if (inp == "MOVE")
    $robot.move()
  elsif (inp == "LEFT")
    $robot.left()
  elsif (inp == "RIGHT")
    $robot.right()
  elsif (inp == "REPORT")
    puts $robot.report()
  elsif (/PLACE [[:digit:]]+,[[:digit:]]+,(NORTH|SOUTH|EAST|WEST)/.match(inp))
    cordinates = inp.scan(/\d+/)
    direction = inp.scan(/\w+/)
    $robot.place(cordinates[0].to_i,cordinates[1].to_i,direction[3])
  elsif (inp == "QUIT")
    break
  end
end

puts "SYSTEM EXIT"