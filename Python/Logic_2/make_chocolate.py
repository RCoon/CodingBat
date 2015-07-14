# We want make a package of goal kilos of chocolate. We have small bars
# (1 kilo each) and big bars (5 kilos each). Return the number of small bars
# to use, assuming we always use big bars before small bars. Return -1 if it
# can't be done. 

# make_chocolate(4, 1, 9) --> 4
# make_chocolate(4, 1, 10) --> -1
# make_chocolate(4, 1, 7) --> 2

def make_chocolate(small, big, goal):
  if goal < 5 or big < 1:
    if small >= goal:
      return goal
    else:
      return -1
  
  req_5s = int(goal / 5)
  if big >= req_5s:
    sum_5s = 5 * req_5s
    req_ones = goal - sum_5s
    if req_ones <= small:
      return req_ones
    else:
      return -1
  else:
    sum_5s = 5 * big
    req_ones = goal - sum_5s
    if req_ones <= small:
      return req_ones
    else:
      return -1

print(make_chocolate(4, 1, 9))
print(make_chocolate(4, 1, 10))
print(make_chocolate(4, 1, 7))
