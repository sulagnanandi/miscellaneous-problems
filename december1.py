
list_a = [] # list A
list_b = [] # list B
distances = [] # will store all distances between corresponding entries
num_inputs = 1000 # length of each list

# user input for lists A and B
for i in range(num_inputs):
    line = input()
    a, b = map(int, line.split())
    list_a.append(a)
    list_b.append(b)

# finding distances for 1000 pairs
for i in range(num_inputs):

    num_a = list_a[0]
    num_b = list_b[0]
    num_a_id = 0
    num_b_id = 0

    # find the smallest number in list A
    for i in range(len(list_a)):
        if list_a[i] < num_a:
            num_a = list_a[i] # store the smallest number in list A as num_a
            num_a_id = i
    list_a.pop(num_a_id) # remove the smallest number from list A

    # find the smallest number in list B
    for i in range(len(list_b)):
        if list_b[i] < num_b:
            num_b = list_b[i] # store the smallest number in list B as num_b
            num_b_id = i
    list_b.pop(num_b_id) # remove the smallest number from list B

    # find the distance between num_a and num_b
    distances.append(abs(num_a - num_b))

print(sum(distances)) # add up all the distances and print



