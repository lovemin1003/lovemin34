# -*- coding: utf-8 -*-
"""
Created on Wed Jan  1 21:44:26 2020

@author: COM
"""

from tkinter import *
window=Tk()

canvas=Canvas(window,width=500,height=500)
canvas.pack()

img= PhotoImage(file="포켓몬잡은 우리.gif")
canvas.create_image(0,0, anchor=NW, image=img)

window.mainloop()