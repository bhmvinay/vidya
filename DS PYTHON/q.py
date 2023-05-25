from queue import PriorityQueue
p=PriorityQueue()

p.put((2,"raj"))
p.put((1,"vidya"))
p.put((3,"vinay"))

next = p.get()
print(next)

print(p.empty())
print(p.full)

p.put((4,"jayraj"))

while not p.empty():
    print(p.get())