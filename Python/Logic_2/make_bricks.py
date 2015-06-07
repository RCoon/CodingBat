# We want to make a row of bricks that is goal inches long. We have a number
# of small bricks (1 inch each) and big bricks (5 inches each). Return True
# if it is possible to make the goal by choosing from the given bricks.
# This is a little harder than it looks and can be done without any loops. 

# make_bricks(3, 1, 8) → True
# make_bricks(3, 1, 9) → False
# make_bricks(3, 2, 10) → True

def make_bricks(small, big, goal):
  num_fives = goal // 5
  num_ones = goal - (5 * num_fives)
  
  if num_fives <= big and num_ones <= small:
    return True
  elif (num_fives >= big) and ((goal - (5 * big)) <= small):
    return True
  else:
    return False


print(make_bricks(3, 1, 8))
print(make_bricks(3, 1, 9))
print(make_bricks(3, 2, 10))
