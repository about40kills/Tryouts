#removing duplicates
numbers= [2, 3, 5, 9, 9, 4, 2, 4, 5, 6, 0]
uniques = []
for number in numbers:
    if number not in uniques:
        uniques.append(number)
print(uniques)