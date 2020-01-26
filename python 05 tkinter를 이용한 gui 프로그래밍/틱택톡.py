# -*- coding: utf-8 -*-
"""
Created on Thu Jan  2 21:54:11 2020

@author: COM
"""

from tkinter import *

# i번째 버튼을 누를 수 있는지 검사한다. 누를 수 있으면 X나 O을 표시한다
def checked(i):
    global player
    button = list[i] # 리스트에서 i번째 버튼 객체를 가져온다.
    
    # 이미 누른 버턴은 아무 작업 없이 리턴한다.
    if button["text"] != " ":
        return
    
    button["text"] = player
    button["bg"] = "green"
    
    if player=="X":
        
        player="S"
        button["bg"] ="blue"
        
    elif player=="S":
        
        player="X"
        button["bg"]="red"

window =Tk()
player = "X" # 시작 플레이어는 X
list=[]

for i in range(121):
    b=Button(window, text=" ", command=lambda k=i: checked(k))
    b.grid(row=i//11, column=i%11)
    list.append(b)
    
window.mainloop()    
       