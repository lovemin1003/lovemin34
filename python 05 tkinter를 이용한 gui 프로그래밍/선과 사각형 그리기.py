# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 22:47:01 2019

@author: COM
"""

from tkinter import *

window= Tk()
w=Canvas(window, width=300, height=250)
w.pack()

w.create_line(0,0,300,250)

i=w.create_line(0,0,250,250, fill="blue")
w.coords(i,0,0,20,200) # 좌표 변경
w.itemconfig(i, fill="green") # 색상 변경

w.create_rectangle(50,50,200,200, fill="violet")
w.create_rectangle(200,200,250,250, outline="violet") # 경계선 색상 지정

# w.delete(i) #i를 삭제
# w.delete(ALL) # 모든 항목 삭제

window.mainloop()