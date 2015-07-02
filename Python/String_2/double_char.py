# Given a string, return a string where for every char in the original, there
# are two chars.  

# double_char('The') --> 'TThhee'
# double_char('AAbb') --> 'AAAAbbbb'
# double_char('Hi-There') --> 'HHii--TThheerree'

def double_char(str):
  result = ''
  for c in str:
    result += c*2
  return result

print(double_char('The'))
print(double_char('AAbb'))
print(double_char('Hi-There'))
