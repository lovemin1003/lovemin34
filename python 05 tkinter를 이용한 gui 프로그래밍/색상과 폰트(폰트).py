# -*- coding: utf-8 -*-
"""
Created on Sun Dec 29 19:18:56 2019

@author: COM
"""

import tkinter as tk
"""tkinter.font를 font로 접근"""
import tkinter.font as font


class app:
    def __init__(self):
        
        root=tk.Tk()
       
        self.customFont = font.Font(family="궁서체", size=20)
        
        buttonframe=tk.Frame()
        label=tk.Label(root,text="애프터그로우",font=self.customFont)
        
        buttonframe.pack()
        label.pack()
        
        big=tk.Button(root,text="커져라!", command=self.bigfont)
        small=tk.Button(root,text="귀엽게!", command=self.smallfont)
        big.pack()
        small.pack()
        
        root.mainloop()
        
    def bigfont(self):
        size=self.customFont['size']
        self.customFont.configure(size=size+20)
        if size>=200:
            self.customFont.configure(size=10)
        
    def smallfont(self):
        size=self.customFont['size']
        self.customFont.configure(size=size-2)  
        if size<=0:
            self.customFont.configure(size=10) 

App=app()        