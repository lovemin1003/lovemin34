# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 12:53:09 2020

@author: COM
"""

from tkinter import *

def click(key):
    if key=='=':
        try: 
            result=eval(entry.get())
            entry.delete(0,END)
            entry.insert(END, str(result))
        except:
            entry.insert(END, "5류")
    elif key=='C':
        entry.delete(0,END)
    else:
        entry.insert(END,key)

window = Tk()
window.title("간단한 계산기")

button=[
 '7','8','9','+','C',
 '4','5','6','-',' ',
 '1','2','3','*',' ',
 '0','.','=','/',' ']     

i=0

for b in button:
    cmd = lambda x=b: click(x) #람다식으로 함수를 정의해줌.
    but = Button(window, text=b, width=5, relief='ridge', command=cmd)
    but.grid(row=i//5+1, column=i%5)
    i+=1
    
entry= Entry(window, width=33, bg="pink")
entry.grid(row=0, column=0,columnspan=5) 

window.mainloop()   