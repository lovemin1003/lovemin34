# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 22:25:50 2019

@author: COM
"""

from tkinter import *

window = Tk()

t=Text(window, height=5, width=50)
t.pack()
t.insert(END,"오늘 포켓몬 배틀 재미있음.\n 승리의 에이스번.")

window.mainloop()