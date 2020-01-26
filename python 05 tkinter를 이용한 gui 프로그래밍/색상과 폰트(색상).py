# -*- coding: utf-8 -*-
"""
Created on Sun Dec 29 18:58:53 2019

@author: COM
"""

from tkinter import *

window = Tk()

label1 = Button(window,text="헬로 해피 월드")

label1.pack(side=RIGHT,padx=10,pady=100)

label2 = Button(window,text="로젤리아")

label2.pack(side=LEFT,padx=20)

"""텍스트 색상 조정"""
label1["fg"]="#0000FF"

label2["fg"]="violet"

"""배경 색상 조정"""
label1["bg"]="#FF00FF"

label2["bg"]="black"


window.mainloop()

