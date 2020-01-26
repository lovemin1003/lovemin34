# -*- coding: utf-8 -*-
"""
Created on Sun Dec 29 20:34:53 2019

@author: COM
"""
from tkinter import * 
import tkinter.font

window=Tk()
""" slant:기울임 overstrike:겹쳐서 찍기 """
        
font=tkinter.font.Font(family="궁서체", size=20, slant="italic", weight="normal", underline = "False", 
                               overstrike = "False")

label=tkinter.Label(window, text="""가나다라마바사아자차카타파하
동해물과 백두산이 마르고 닳도록
하느님이 보우하사 우리나라만세
abcdefghijzklmnop
1234567890
~!@#$%^&*()
""", font=font)
label.pack()

window.mainloop()
