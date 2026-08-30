def add_two_numbers() -> int:
    user_input = input()
    string_nums = user_input.split(",")

    sum = 0
    for item in string_nums:
        sum += int(item)
    
    return sum
        




# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
