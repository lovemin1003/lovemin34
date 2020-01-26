# -*- coding: utf-8 -*-
"""
Created on Wed Jan  1 22:37:11 2020

@author: COM
"""

from tkinter import *
window=Tk()

canvas=Canvas(window,width=500,height=500)
canvas.pack()
id=canvas.create_oval(10,100,60,160, fill='blue')

def move_right(event):
    canvas.move(id, 5, 0)
    
canvas.bind_all('<KeyPress-Right>', move_right)

def move_left(event):
    canvas.move(id, -5, 0)
    
canvas.bind_all('<KeyPress-Left>', move_left)

window.mainloop()