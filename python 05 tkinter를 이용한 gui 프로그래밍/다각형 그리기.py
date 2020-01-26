# -*- coding: utf-8 -*-
"""
Created on Wed Jan  1 21:21:38 2020

@author: COM
"""

from tkinter import *

w=300   
h=300
window=Tk()

w = Canvas(window, width=w, height=h)
w.pack()

points=[0,0,100,100,200,100]
w.create_polygon(points, outline="red", fill='yellow', width=5)

window.mainloop()