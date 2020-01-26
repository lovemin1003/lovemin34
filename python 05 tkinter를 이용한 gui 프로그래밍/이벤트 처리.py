# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 13:04:36 2020

@author: COM
"""

from tkinter import *

window=Tk()

def callback(event):
    frame.focus_set()
    print(event.x, event.y, "에서 마우스 이벤트 발생")
    
def key(event):
    print( repr(event.char),"입력")

frame = Frame(window, width=100, height=100)
frame.bind("<Key>",key)
frame.bind("<Button-1>",callback)
frame.pack()

window.mainloop()    