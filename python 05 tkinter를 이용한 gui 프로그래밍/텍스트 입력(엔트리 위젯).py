# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 21:42:15 2019

@author: COM
"""

from tkinter import *

def show():
    print("이름:%s 타입:%s" % (e1.get(),e2.get()))

window = Tk()

Label(window, text="이름").grid(row=0)
Label(window, text="타입").grid(row=1)

e1 = Entry(window)
e2 = Entry(window)

e1.grid(row=0, column=1) #테이블의 0번째 행, 1번째 열에 배치. 
e2.grid(row=1, column=1)

Button(window, text='확인',command=show).grid(row=3, column=0, sticky=W,pady=4)
Button(window, text='종료',command=window.quit).grid(row=3, column=1, sticky=W,pady=4)

window.mainloop()
