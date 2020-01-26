# -*- coding: utf-8 -*-
"""
Created on Thu Dec 26 23:39:55 2019

@author: COM
"""

class vec:
    def __init__(self,x,y):
        self.x=x
        self.y=y
    def __add__(self,other):
        return(self.x+other.x,self.y+other.y)
    def __sub__(self,other):
        return(self.x-other.x,self.y-other.y)
    def __mul__(self,other):
        return(self.x*other.x,self.y*other.y)         
        
a=vec(1,1)
b=vec(0,2)
c=vec(2,0)
"""__add__(덧셈)""""
d=a+b
print(d)   
"""__sub__(뺄셈)""""
e=a-c
print(e)
"""__mul__(곱셈)"""
f=b*c
print(f)