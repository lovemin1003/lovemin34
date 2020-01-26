# -*- coding: utf-8 -*-
"""
Created on Thu Jan  2 21:20:07 2020

@author: COM
"""

from tkinter import *
window=Tk()

b1=Button(window,text="하나")
b2=Button(window,text="우리")
b1.grid(row=0,column=0)
b2.grid(row=1,column=1)

Label(window,text="귀여운").grid(row=1,column=0)

window.mainloop()