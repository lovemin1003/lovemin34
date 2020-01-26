# -*- coding: utf-8 -*-
"""
Created on Mon Dec 30 00:13:22 2019

@author: COM
"""

from tkinter import *
window = Tk()


photo= PhotoImage(file="포켓몬잡은 우리.gif")

w = Label(window,image=photo)
w.pack(side="left")
message="""포켓몬의 수호신은 누구인가? 우리님이야말로 포켓몬의 수호신! 우리들의 여신!"""
w2=Label(window, justify=LEFT, pady=10, text=message).pack(side="left")
"""레이블의 font 속성을 설정하면 폰트를 변경할 수 있으며 색상은 fg, bg로 변경할 수 있음."""
w3=Label(window, fg="blue", bg="white", justify=LEFT, padx=10, text=message, font="고딕체 9").pack(side="left")

window.mainloop()