# -*- coding: utf-8 -*-
"""
Created on Sun Dec 29 17:44:16 2019

@author: COM
"""

from tkinter import *

window = Tk()

label1 = Button(window,text="헬로 해피 월드")
"""padx=가로 픽셀 추가 pady=세로 픽셀 추가"""
label1.pack(side=RIGHT,padx=10,pady=100)

label2 = Button(window,text="로젤리아")

label2.pack(side=LEFT,padx=20)

"""텍스트명 수정"""
label1["text"]="포핀 파티"

window.mainloop()