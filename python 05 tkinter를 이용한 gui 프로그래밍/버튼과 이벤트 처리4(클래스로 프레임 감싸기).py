# -*- coding: utf-8 -*-
"""
Created on Sun Dec 29 18:59:49 2019

@author: COM
"""


from tkinter import *

class App:
    def __init__(self):
        window = Tk()
        """fg: 글자색 조정"""
        
        Label1 = Label(window,text="로젤리아",  fg="cyan")
        Label1.pack(padx=10,pady=10)
        
        
        Button1 = Button(window,text="로젤리아", command=self.rose, fg="violet")
        Button1.pack(padx=10,pady=10)
        
        Button2 = Button(window,text="포핀파티", command=self.poppin, fg="red")
        Button2.pack(padx=10,pady=10)
        
        
        window.mainloop()
        
    def rose(self):
        print("우리의 음악에 매료될 각오가 있어?")
    def poppin(self):
        print("포피파 피포파 포피파파피포파")       



App()