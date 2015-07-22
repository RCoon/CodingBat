# Return the sum of the numbers in the array, returning 0 for an empty array.
# Except the number 13 is very unlucky, so it does not count and numbers that
# come immediately after a 13 also do not count. 

# sum13([1, 2, 2, 1]) --> 6
# sum13([1, 1]) --> 2
# sum13([1, 2, 2, 1, 13]) --> 6

def sum13(nums):
  total = 0
  for i in range(len(nums)):
    if (nums[i] == 13):
      continue
    elif (i > 0 and nums[i-1] == 13):
      continue
    else:
      total += nums[i]
  return total

print(sum13([1, 2, 2, 1]))
print(sum13([1, 1]))
print(sum13([1, 2, 2, 1, 13]))
