# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 23:28:08 2019

@author: COM
"""

from tkinter import *

window= Tk()
w=Canvas(window, width=300, height=250)
w.pack()

w.create_oval(50,50,200,200)


window.mainloop()