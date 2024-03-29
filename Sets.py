# Creating a set
my_set = {1, 2, 3, 4, 5}

# Adding elements to a set
my_set.add(6)
my_set.add(1)  # Trying to add a duplicate element, won't be added

# Removing elements from a set
my_set.remove(3)
# it does not remove based on index

# Printing the set
print(my_set)  # Output: {1, 2, 4, 5, 6}

# Set operations
set1 = {1, 2, 3}
set2 = {3, 4, 5}

union_set = set1 | set2  # Union of sets 
intersection_set = set1 & set2  # Intersection of sets
difference_set = set1 - set2  # Set difference
symmetric_difference_set = set1 ^ set2  # Symmetric difference

print(union_set)  # Output: {1, 2, 3, 4, 5}
print(intersection_set)  # Output: {3}
print(difference_set)  # Output: {1, 2}
print(symmetric_difference_set)  # Output: {1, 2, 4, 5}
