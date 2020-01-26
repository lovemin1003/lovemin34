# -*- coding: utf-8 -*-
"""
Created on Thu Jan  2 20:50:26 2020

@author: COM
"""

from tkinter import *

window=Tk()

choice= IntVar()
choice.set(1)

list=[("파치레곤",1), ("샹델라",2), ("몰드류",3)]

def printchoice():
    print( choice.get())

Label(window, text="포켓몬을 고르시오.", justify=LEFT, padx=30).pack()

for txt, val in list: # 리스트에 저장된 텍스트와 값을 가져와서 라디오 버튼을 생성.
    Radiobutton(window, text=txt, padx=30, variable=choice, command=printchoice, value=val).pack(anchor=W)
    #value에 저장된 값을 variable에 출력시키는 듯.

window.mainloop()    
    