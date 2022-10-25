a=set(map(int,input("Enter the Numbers with spaces: ").split()))
a.remove(max(a))
print(max(a))
