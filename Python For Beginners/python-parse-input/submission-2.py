from typing import List

def read_integers() -> List[int]:
    user_input = input()
    string_list = user_input.split(",")
    
    int_list = []
    for item in string_list:
        int_list.append(int(item))

    return int_list

# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())
