# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 13:28:30 2020

@author: COM
"""

from tkinter import *

def motion(event):
    print("마우스 위치: %s,%s"%(event.x,event.y))
    return

window=Tk()
mes="영리하고 마음 착한 포켓몬. 아름다운 소리로 노래 부르며 바다 위를 헤엄친다."

message=Message(window, text= mes)
message.config(bg="violet",fg="gold")
message.bind('<Motion>',motion)
message.pack()

window.mainloop()