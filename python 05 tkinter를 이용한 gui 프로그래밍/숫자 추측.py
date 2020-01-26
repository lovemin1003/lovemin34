# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 14:03:44 2020

@author: COM
"""

from tkinter import *
import random

ans = random.randint(1,100)

def guessing():
    guess = int(guessField.get())
    
    if guess > ans:
        msg="과대평가"
    elif guess< ans:
        msg="과소평가"
    else:
        msg="정답"
    resultLabel["text"] = msg
    guessField.delete(0,5)
    
def reset():
    global ans
    ans = random.randint(1,100)
    resultLabel["text"] = "다시 한번!"

window = Tk()
window.configure(bg="pink") 
window.title("숫자를 맞추시오.") 
window.geometry("500x80")

tltleLabel = Label(window, text="숫자 게임에 어서오삼.")
tltleLabel.pack()
  
guessField=Entry(window)
guessField.pack(side="left") 

trybutton = Button(window, text="시도", command=guessing)
trybutton.pack(side="left")

resetbutton = Button(window, text="리셋", command=reset)
resetbutton.pack(side="left")

resultLabel=Label(window, text="1-100사이의 숫자를 입력하시오.")
resultLabel.pack(side="left")


window.mainloop()
   
        