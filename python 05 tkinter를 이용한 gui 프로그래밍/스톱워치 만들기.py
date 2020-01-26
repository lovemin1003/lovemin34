# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 12:19:54 2020

@author: COM
"""

import tkinter as tk

def startTimer():
    if(running):
        global timer
        timer = timer+1
        timeText.configure(text=str(timer))
    window.after(1110,startTimer)

def start():
    global running
    running = True

def stop():
    global running
    running = False

running = False

window=tk.Tk()

timer=0

# timeText = tk.Label(window, text="0", font=10).pack()로 코딩시 
# 'NoneType' object has no attribute 'configure' 오류가 나옴.

timeText = tk.Label(window, text="0", font=10)

timeText.pack()

startbutton = tk.Button(window, text="시작", command=start).pack()    

stopbutton = tk.Button(window, text="중지", command=stop).pack()    
  
startTimer()

window.mainloop()

# print(type(timeText)) -> <class 'tkinter.Label'>