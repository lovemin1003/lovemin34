# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 23:42:41 2019

@author: COM
"""

import random
from tkinter import *

window= Tk()
w=Canvas(window, width=300, height=250)
w.pack()
color=["red","blue","violet","yellow","green"]

def rect():
    x= random.randint(10,270)
    y= random.randint(10,225)
    z= random.randrange(100)
    a= random.randrange(100)
    w.create_rectangle(x,y,z,a, fill=random.choice(color))

for i in range(5):
    rect()

window.mainloop()