# Return True if the given string contains an appearance of "xyz" where the xyz
# is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does
# not. 

# xyz_there('abcxyz') --> True
# xyz_there('abc.xyz') --> False
# xyz_there('xyz.abc') --> True

def xyz_there(str):
  for i in range(len(str)):
    if (str[i:i+3] == "xyz"):
      if (i > 0 and str[i-1] != "." or i == 0):
        return True
  return False

print(xyz_there('abcxyz'))
print(xyz_there('abc.xyz'))
print(xyz_there('xyz.abc'))
