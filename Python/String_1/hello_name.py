# Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

# hello_name('Bob') → 'Hello Bob!'
# hello_name('Alice') → 'Hello Alice!'
# hello_name('X') → 'Hello X!'

def hello_name(name):
  return 'Hello {0}!'.format(name)

print(hello_name('Bob'))
print(hello_name('Alice'))
print(hello_name('X'))
