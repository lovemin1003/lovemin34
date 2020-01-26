# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 00:06:34 2019

@author: COM
"""

from tkinter import *
"""jpg 파일은 못 여는 것 같으며 pycharm에서 기동시킴."""
window = Tk()
window.title("윈도창 연습"); #캡션
# window.geometry("240x360"); #윈도우 창의 크기
window.resizable(width=TRUE, height = TRUE); # 최대화 가능범위 둘 다 FALSE면 작동 불가

photo= PhotoImage(file="포켓몬잡은 우리.gif")

w = Label(window,image=photo)
w.photo=photo
w.pack()
window.mainloop()