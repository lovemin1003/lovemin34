# -*- coding: utf-8 -*-
"""
Created on Wed Jan  1 23:30:12 2020

@author: COM
"""

from tkinter import *

def draw(event):
    x1,y1=(event.x-1), (event.y-1)
    x2,y2=(event.x+1), (event.y+1)
    canvas.create_oval(x1,y1,x2,y2, fill='blue')
window=Tk()

canvas=Canvas(window,width=500,height=500)
canvas.pack(expand= YES, fill =BOTH)
canvas.bind("<B1-Motion>",draw)

message=Label(text="마우스 드래그시 점들이 그려짐.")
message.pack()

window.mainloop()