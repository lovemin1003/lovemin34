# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 11:45:17 2020

@author: COM
"""

from tkinter import *

window=Tk()
type=["드래곤","페어리","물"]

i=0

for q in type:
    Label(window, text=q, relief=RIDGE, width=10).grid(row=i, column="0")
    # relief=RIDGE->테두리를 만들어줌
    i=i+1

i=0

color=["violet","pink","blue"]
for w in color:
    Button(window, bg=w, width=10).grid(row=i, column="1")
    i=i+1    

window.mainloop()    