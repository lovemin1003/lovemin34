# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 23:18:03 2019

@author: COM
"""

from tkinter import colorchooser

window= Tk()
w=Canvas(window, width=300, height=250)
w.pack()
color=colorchooser.askcolor()

w.create_rectangle(0,0,250,250, fill=color[1])
window.mainloop()