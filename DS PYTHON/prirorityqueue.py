from queue import PriorityQueue
p=PriorityQueue()

p.put((2,"raj"))
p.put(1,"vidya")
p.put(4,"vinay")

next = p.get()
print(next)

p.empty()
p.full

p.put(3,"jayraj")

while not p.empty():
    print(p.get())