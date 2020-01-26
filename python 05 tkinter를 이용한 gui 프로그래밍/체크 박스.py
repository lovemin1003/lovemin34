# -*- coding: utf-8 -*-
"""
Created on Thu Jan  2 21:03:16 2020

@author: COM
"""

from tkinter import *

window=Tk()

Label(window, text="참가시킬 포켓몬을 선택하세요.(앞의 3버튼 중 하나 누르면 앞의 3버튼이 다 체크됨",).grid(row=0, sticky=W)

value=IntVar()

Checkbutton(window, text="에이스번",variable=value).grid(row=1, sticky=W)
Checkbutton(window, text="인텔리레온",variable=value).grid(row=2, sticky=W)
Checkbutton(window, text="코릴타",variable=value).grid(row=3, sticky=W)

Label(window, text="참가시킬 포켓몬을 선택하세요.(아래의 3버튼 중 하나 누르면 누른 버튼만 체크됨",).grid(row=4, sticky=W)

value1=IntVar()
Checkbutton(window, text="에이스번",variable=value1).grid(row=5, sticky=W)
value2=IntVar()
Checkbutton(window, text="인텔리레온",variable=value2).grid(row=6, sticky=W)
value3=IntVar()
Checkbutton(window, text="인텔리레온",variable=value3).grid(row=7, sticky=W)

window.mainloop()