def decToBiner(num):
    """Convert decimal to binary."""
    if num < 0:
        raise ValueError("Negative numbers are not supported.")
    return bin(num)[2:]
def decToHexa(num):
    """Convert decimal to hexadecimal."""
    if num < 0:
        raise ValueError("Negative numbers are not supported.")
    return hex(num)[2:].upper()
def decToOctal(num):
    """Convert decimal to octal."""
    if num < 0:
        raise ValueError("Negative numbers are not supported.")
    return oct(num)[2:]