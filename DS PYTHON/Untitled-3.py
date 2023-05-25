def bubblesort(a):
    n=len(a)
    for i in range(n-2):
        for j in range(n-2-i):
            if a[j]>a[j+1]:
                temp=a[j]
                a[j]=a[j+1]
                a[j+1]=temp
a=[3,10,16,1,3,20]
print("before sorrting:",a)
bubblesort(a)
print("after sorrting:",a)