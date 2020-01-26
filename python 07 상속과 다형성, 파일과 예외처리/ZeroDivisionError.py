# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 20:34:57 2020

@author: COM
"""

x=3
y=0

try:
    a=x/y
except ZeroDivisionError:
    print("0으로 나누는 예외")
    
try:
    a=x/y
except ZeroDivisionError as q:
    print(q)  
    
    