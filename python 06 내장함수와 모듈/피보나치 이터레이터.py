# -*- coding: utf-8 -*-
"""
Created on Mon Jan  6 22:12:40 2020

@author: COM
"""

class fib:
    def __init__(self, a=1, b=0, max=50):
        self.a=a
        self.b=b
        self.max=max
    def __iter__(self):
        return self
    def __next__(self):
        n = self.a+self.b
        if n > self.max:
            raise StopIteration
        self.a=self.b
        self.b=n
        return n

for i in fib():
    print(i, end=" ")
    
    