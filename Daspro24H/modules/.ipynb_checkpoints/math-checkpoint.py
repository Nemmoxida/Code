def sum(*numbers):
    total = 0
    for i in numbers:
        total += i
    return total

def pow(number, power):
    return number ** power

def multi(*numbers):
    total = 1
    for i in numbers:
        total *= i
    return total