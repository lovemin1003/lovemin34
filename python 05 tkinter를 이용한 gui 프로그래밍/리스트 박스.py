# -*- coding: utf-8 -*-
"""
Created on Thu Jan  2 21:11:21 2020

@author: COM
"""

from tkinter import *

window= Tk()

#리스트 박스는 스크롤바와 같이 쓸 수 있음.
sb = Scrollbar(window, orient=VERTICAL)
sb.pack(side=RIGHT, fill=Y)

lb= Listbox(window, height=3)
lb.pack()

#아래의 두 코드로 리스트박스와 스크롤바를 연결시켜줘야 스크롤바가 작동함.
sb.configure(command=lb.yview)
lb.configure(yscrollcommand=sb.set)

lb.insert(END,"짜랑고우거")
lb.insert(END,"드래펄트")
lb.insert(END,"미끄래곤")
lb.insert(END,"파치래곤")
lb.insert(END,"어치르돈")
lb.insert(END,"리자몽")

window.mainloop()