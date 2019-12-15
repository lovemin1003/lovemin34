# -*- coding: utf-8 -*-
"""
Created on Sun Dec 15 10:30:21 2019

@author: COM
"""

import turtle

t1=turtle.Turtle()

for i in range(30):
    t1.forward(23)
    t1.right(12)
    
t1.pencolor("blue")    
    
for i in range(0,36):
    t1.forward(20)
    t1.right(10)

t1.pencolor("green")
    
for i in [0,1,2,3]:    
    t1.forward(80)
    t1.right(90)