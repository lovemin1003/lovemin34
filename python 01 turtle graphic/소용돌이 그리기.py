# -*- coding: utf-8 -*-
"""
Created on Sun Dec 15 17:52:37 2019

@author: COM
"""


import turtle

t=turtle.Turtle()

a=int(input("소용돌이 선 몇 개?:"))
"""각도"""
b=15
"""이동 거"""
c=10.0
for i in range (a):
    t.forward(c)
    t.right(b)
    c+=0.1
    if(i%3==0):
       t.color("orange")
    elif(i%3==1):
       t.color("green")   
    else:
       t.color("violet")