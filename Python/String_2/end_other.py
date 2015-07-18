# Given two strings, return True if either of the strings appears at the very
# end of the other string, ignoring upper/lower case differences (in other
# words, the computation should not be "case sensitive"). 

# end_other('Hiabc', 'abc') --> True
# end_other('AbC', 'HiaBc') --> True
# end_other('abc', 'abXabc') --> True

def end_other(a, b):
  a_low = a.lower()
  b_low = b.lower()
  
  return (a_low.endswith(b_low) or b_low.endswith(a_low))

print(end_other('Hiabc', 'abc'))
print(end_other('AbC', 'HiaBc'))
print(end_other('abc', 'abXabc'))
