# Given an array of ints, return True if .. 1, 2, 3, .. appears in the array
# somewhere. 

# array123([1, 1, 2, 3, 1]) --> True
# array123([1, 1, 2, 4, 1]) --> False
# array123([1, 1, 2, 1, 2, 3]) --> True

def array123(nums):
  a = [1,2,3]
  return set(a).issubset(nums)

print(array123([1, 1, 2, 3, 1]))
print(array123([1, 1, 2, 4, 1]))
print(array123([1, 1, 2, 1, 2, 3]))
