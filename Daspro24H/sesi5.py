name = input("Enter your name: ")
age = int(input("Enter your age: "))
address = input("Enter your address: ")

print("Your name is {} Your age is {} Your address is {}".format(name, age, address))

uni = "UNIVERSITAS NUSA PUTRA SUKABUMI"

# a. putra nusa
a = uni[17:23] + " " + uni[12:17]
print("a.", a.lower())

# b. NIVERSITAS NSA PTRA SKABMI
b = uni[1:11] + " " + uni[12] + uni[14:16] + " " + uni[17] + uni[19:22] + " " + uni[23] + uni[25:]
print("b.", b)

# c. SUKABUMI PUTRA NUSA UNIVERSITAS
c = uni[23:] + " "+ uni[17:22] + " " + uni[12:16] + " " + uni[0:11]
print("c.", c)

# d. UNPS
d = uni[0] + uni[12] + uni[17] + uni[23]
print("d.", d)

# e. TAS SAPU BUMI
e = uni[8:11] + " " + uni[14:19] + " " + uni[27:]
print("e.", e)