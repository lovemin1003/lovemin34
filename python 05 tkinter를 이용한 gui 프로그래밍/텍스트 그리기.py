# -*- coding: utf-8 -*-
"""
Created on Wed Jan  1 21:26:00 2020

@author: COM
"""

from tkinter import *
window=Tk()

canvas=Canvas(window,width=500,height=500)
canvas.pack()


canvas.create_text(100,100,text='새해엔 목적을 달성해야 하는데...', fill='blue', font=('Courier',8))
canvas.create_text(100,150,text='새해엔 목적을 달성해야 하는데...', fill='red', font=('Hevetica',10))
canvas.create_text(100,200,text='새해엔 목적을 달성해야 하는데...', fill='brown', font=('Times',12))

window.mainloop()