# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 23:34:31 2019

@author: COM
"""

from tkinter import *

window= Tk()
w=Canvas(window, width=300, height=250)
w.pack()

for deg in range(0,360,10):
    w.create_arc(10, 10+deg//5, 200, 150+deg//5, extent=deg, style=ARC)
# //:나누기
window.mainloop()