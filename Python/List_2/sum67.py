# Return the sum of the numbers in the array, except ignore sections of numbers
# starting with a 6 and extending to the next 7 (every 6 will be followed by at
# least one 7). Return 0 for no numbers. 

# sum67([1, 2, 2]) --> 5
# sum67([1, 2, 2, 6, 99, 99, 7]) --> 5
# sum67([1, 1, 6, 7, 2]) --> 4

def sum67(nums):
  if (len(nums) == 0):
    return 0
  
  sum = 0
  i = 0
  while (i < len(nums)):
    if (nums[i] != 6):
      sum += nums[i]
      i += 1
    elif (nums[i] == 6):
      index7 = nums.index(7, i)
      i = index7 + 1
  return sum

print(sum67([1, 2, 2]))
print(sum67([1, 2, 2, 6, 99, 99, 7]))
print(sum67([1, 1, 6, 7, 2]))
