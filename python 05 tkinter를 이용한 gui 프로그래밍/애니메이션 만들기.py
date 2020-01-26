# -*- coding: utf-8 -*-
"""
Created on Wed Jan  1 21:50:26 2020

@author: COM
"""

import time
from tkinter import *
window=Tk()

canvas=Canvas(window,width=500,height=500)
canvas.pack()
id=canvas.create_oval(10,100,60,160,fill='blue')

for i in range(100):
    canvas.move(id, 3, 5)
    time.sleep(0.05)
    window.update()
    canvas.move(id, 3, -5)
    time.sleep(0.05)
    window.update()


