# -*- coding: utf-8 -*-
"""
Created on Sun Dec 15 17:32:17 2019

@author: COM
"""

import turtle

window=turtle.Screen()

window.bgcolor("white")

t = turtle.Turtle()

color=['red','black','brown','yellow']

for i in color:
    t.color(i)
    t.forward(100)
    t.right(90)