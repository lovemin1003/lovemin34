# -*- coding: utf-8 -*-
"""
Created on Sun Dec 29 17:51:19 2019

@author: COM
"""

from tkinter import *

def callback():
    Button1["text"]="우리의 음악에 매료될 각오가 있어?"

window = Tk()

Label1 = Label(window, text="뱅드림")

Label1.pack()

"""command=callback: 버튼 클릭시 callback 함수 호출해줌. """

Button1 = Button(window,text="로젤리아", command=callback)

Button1.pack(padx=10,pady=10)

window.mainloop()