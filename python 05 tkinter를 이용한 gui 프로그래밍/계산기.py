# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 22:32:50 2019

@author: COM
"""

from tkinter import *
from math import *

def cal(event):
    label.configure(text="result:"+str(eval(entry.get())))
    # eval() 함수를 호출해서 사용자가 입력한 수식을 계산함. 
    # 레이블의 configure()를 호출하여 레이블의 텍스트를 변경한다.

window=Tk()

Label(window,text="python 수식 입력:").pack()
entry=Entry(window)    
entry.bind("<Return>", cal)
# 엔트리 위젯에서 엔터키를 치면 cal()가 호출되게 연결한다. 이벤트 처리 부분을 참고함.

entry.pack()
label=Label(window, text="result:")
label.pack()

window.mainloop()