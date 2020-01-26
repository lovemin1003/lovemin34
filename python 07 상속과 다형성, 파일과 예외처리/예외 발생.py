# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 20:44:14 2020

@author: COM
"""



def sub(a):
    if a != "1":
        raise NameError

try:
    b=input("1 빼고 아무거나 눌러보시오.")
    sub(b)
except NameError:
    print("쨩")
    
    
        