import random
import string
from random import choice
from random import shuffle

def generate_password():
    array = list(string.ascii_letters)
    num_array = [x for x in string.digits]
    sym_array = [x for x in string.punctuation]
    new_array = array * 50 + num_array * 50 + sym_array * 50
    for i in range(0, 11):
        random.shuffle(new_array)
    return new_array[:32]

def pass_gen_weak():
    return ''.join(generate_password()[:8])


def pass_gen_med():
    return ''.join(generate_password()[:16])


def pass_gen_strng():
    return ''.join(generate_password()[:24])

def main2():

    loop = True

    while loop:
        answer = input("Would you like a weak, medium, or strong password?\nType quit to exit program\n\n")

        if answer.lower() == 'weak':
            print(pass_gen_weak())
        elif answer.lower() == 'medium':
            print(pass_gen_med())
        elif answer.lower() == 'strong':
            print(pass_gen_strng())
        elif answer.lower() in ['quit', 'q', 'no', 'n', 'stop']:
            loop = False
        else:
            print("Invalid option")

def main():
    print(pass_gen_med())

main()
