# Using curly braces
my_dict = {'name': 'John', 'age': 30, 'city': 'New York'}

# Using dict() constructor
another_dict = dict(name='Alice', age=25, city='London')

# Accessing values
print(my_dict['name'])  # Output: John
print(another_dict.get('age'))  # Output: 25

# Adding elements
my_dict['gender'] = 'Male'

# Updating elements
my_dict['age'] = 35  # Update age to 35

# Removing elements
del my_dict['city']
removed_value = my_dict.pop('age')


# Iterating over keys
for key in my_dict:
    print(key)

# Iterating over values
for value in my_dict.values():
    print(value)

# Iterating over key-value pairs
for key, value in my_dict.items():
    print(key, ':', value)

keys = my_dict.keys()
values = my_dict.values()
items = my_dict.items()
my_dict.clear()
my_dict_copy = my_dict.copy()
my_dict.update({'name': 'Alice'})



