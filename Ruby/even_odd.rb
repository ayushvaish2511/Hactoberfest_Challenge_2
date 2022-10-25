print("Enter the Number: ")
a=gets.to_i
print("\nThe Even Number are:")
for i in 1..a do
  if i%2==0
    print " ",i
  end
end
print("\n\nThe Odd Number are:")
for i in 1..a do
  if i%2!=0
    print " ",i
  end
end
