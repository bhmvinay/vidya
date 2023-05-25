class Queue:
    def __init__(self):
        self.items=[]
    def isempty(self):
        return len(self.items)==0
    def enqueue(self,item):
        self.items.append(item)
    def dequeue(self):
        if self.isempty():
            print("stack is empty")
        else:
            item=self.items.pop(0)
            print("deleted item is : ",item)
    def display(self):
        if self.isempty():
            print("stack is empty")