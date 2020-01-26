# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 14:33:04 2020

@author: COM
"""

from tkinter import *
import random


ans = random.randint(1,100)
limit=1
def guessing():
    global ans
    global limit
    guess = int(guessField.get())
    if limit < 3:
        if guess > ans:
            msg="과대평가",(limit),"번 시도"
            limit+=1
            print(limit-1)
        
        elif guess< ans:
            msg="과소평가",(limit),"번 시도"
            limit+=1
        
        else:
            msg="정답"
            ans = random.randint(1,100)
            limit=1
          
    else:
        resultLabel["text"] = "실패! 다시 하시오."
        
    resultLabel["text"] = msg
    guessField.delete(0,5)
    
def reset():
    global ans
    global limit
    ans = random.randint(1,100)
    limit=1
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