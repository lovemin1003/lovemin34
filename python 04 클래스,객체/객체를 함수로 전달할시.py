# -*- coding: utf-8 -*-
"""
Created on Thu Dec 26 23:13:22 2019

@author: COM
"""

class rec:
    def __init__(self,side=0):
        self.side=side
    def getarea(self):
        return self.side*self.side

def printarea(r,n):
    while n>=1:
        print(r.side,":",r.getarea())
        r.side=r.side+1
        n-=1

my=rec();
count=5
printarea(my,count)
print(my.side) 
print(count)       
    