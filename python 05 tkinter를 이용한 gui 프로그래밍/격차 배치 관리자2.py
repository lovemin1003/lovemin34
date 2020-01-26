# -*- coding: utf-8 -*-
"""
Created on Thu Jan  2 21:25:30 2020

@author: COM
"""

from tkinter import *
window=Tk()

Label(window,text="귀여운", bg="blue").pack()
Label(window,text="귀여움", bg="pink").pack(fill=X) # x방향으로 채우라는 의미
Label(window,text="가여움", bg="red").pack(fill=Y) # y방향으로 채우라는 의미


window.mainloop()