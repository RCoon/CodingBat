# Given an array of ints, return True if the array contains a 2 next to a 2
# somewhere. 

# has22([1, 2, 2]) --> True
# has22([1, 2, 1, 2]) --> False
# has22([2, 1, 2]) --> False

def has22(nums):
  i = 0
  while (i < len(nums)):
    if (nums[i] == 2 and i > 0 and nums[i - 1] == 2):
      return True
    i += 1
  return False

print(has22([1, 2, 2]))
print(has22([1, 2, 1, 2]))
print(has22([2, 1, 2]))
