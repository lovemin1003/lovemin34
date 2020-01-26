# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 14:50:47 2020

@author: COM
"""

from tkinter import *

def printfield():
    print("아디:%s 비번:%s" % (e1.get(), e2.get()))
    
window=Tk()
Label(window, text="아디").grid(row=0)    
Label(window, text="비번").grid(row=1)

e1=Entry(window)
e2=Entry(window)


e1.grid(row=0, column=1)
e2.grid(row=1, column=1)


Button(window, text="접속",command=printfield).grid(row=3, column=0, sticky=W, pady=3)
Button(window, text="종료",command=window.quit).grid(row=3, column=1, sticky=W, pady=3)

window.mainloop()    