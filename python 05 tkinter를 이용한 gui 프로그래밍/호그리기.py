# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 23:29:38 2019

@author: COM
"""

from tkinter import *

window= Tk()
w=Canvas(window, width=300, height=250)
w.pack()

w.create_arc(10,10,100,100)
w.create_arc(50,50,230,230, extent=60) # extent: 각도 지정(미지정시 90도로 나옴.)
w.create_arc(50,50,250,250, style=ARC)

window.mainloop()