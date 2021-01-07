import numpy as np

a = np.ones((5, 5))
b = np.zeros((5, 5))

a = np.append(a, b, axis=1)
print("no.1")
print(a)
a = np.append(a, b, axis=1)
print("no.2")
print(a)
a = np.append(a, b, axis=0)
print("no.3")
print(a)
a = np.append(a, b, axis=1)
print("no.4")
print(a)
print(a.shape)

