class date:
    def _init_(self,a,b,c):
        self.d=a
        self.m=b
        self.y=c
    def day(self):
        print("day=",self.d)
    def month(self):
        print("month=",self.m)
    def year(self):
        print("year=",self.y)
    def monthName(self):
        months = ["Unknown","January","Febuary","March","April","May","June","July", "August","September","October","November","December"]
        print("month name:",months[self.m])
    def isLeapYear(self):
        if(self.y % 400 == 0) and (self.y % 100 == 0):
            print("it is a leap year")
        elif(self.y % 4 == 0) and (self.y % 100 != 0):
            print("it is leap year")
        else:
            print("it is common year")
d1 = date(3,8,2000)
d1.day()
d1.month()
d1.year() 
d1.monthName()
d1.isLeapYear()
