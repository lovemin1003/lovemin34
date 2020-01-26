# -*- coding: utf-8 -*-
"""
Created on Thu Jan  2 07:05:44 2020

@author: COM
"""

from tkinter import *

window=Tk()
choice= IntVar() # 정수형 변수를 생성한다.

Label(window, text="참가시킬 포켓몬을 선택하세요.",
      justify = LEFT, padx=30).pack()

Radiobutton(window, text="창파나이트", padx=30, variable=choice, value=1).pack(anchor=W)
Radiobutton(window, text="브리무음", padx=30, variable=choice, value=2).pack(anchor=W)
Radiobutton(window, text="피카츄", padx=30, variable=choice, value=3).pack(anchor=W)
Radiobutton(window, text="타노스", padx=30, variable=choice, value=4).pack(anchor=W)


window.mainloop()