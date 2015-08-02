# Given a string, return a new string where the first and last chars have been
# exchanged. 

# front_back('code') --> 'eodc'
# front_back('a') --> 'a'
# front_back('ab') --> 'ba'

def front_back(str):
  if len(str) <= 1:
    return str
    
  mid = str[1:-1]
  
  return str[len(str) - 1] + mid + str[0]

print(front_back('code'))
print(front_back('a'))
print(front_back('ab'))
