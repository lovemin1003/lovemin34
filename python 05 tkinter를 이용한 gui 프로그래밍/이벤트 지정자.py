# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 13:25:02 2020

@author: COM
"""

from tkinter import *

def sleft(event):
    print('왼쪽 1번')
    
def dleft(event):
    print('왼쪽 2번')    

widget=Button(None, text="click")
widget.pack()

widget.bind("<Button-1>", sleft)
widget.bind("<Double-1>", dleft)

widget.mainloop()
 