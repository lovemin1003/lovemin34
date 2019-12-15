# -*- coding: utf-8 -*-
"""
Created on Sun Dec 15 17:38:12 2019

@author: COM
"""

import turtle

t=turtle.Turtle()

a=int(input("몇 각형?:"))
b=360/a

for i in range (a):
    t.forward(100)
    t.right(b)
    if(i%2==0):
       t.color("red")
    else:
       t.color("blue")