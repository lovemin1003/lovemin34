# -*- coding: utf-8 -*-
"""
Created on Thu Jan  2 21:46:58 2020

@author: COM
"""

from tkinter import *
window=Tk()
f=Frame(window) # 윈도우 안에 프레임을 띄운다.

b1=Button(f,text="하나")
b2=Button(f,text="우리")
b1.pack(side=LEFT)
b2.pack(side=LEFT)

Label(window,text="질러라!").pack() # 레이블이 윈도우 상단에 배치된다.
f.pack() # 프레임이 수직으로 쌓이게 된다.

window.mainloop()