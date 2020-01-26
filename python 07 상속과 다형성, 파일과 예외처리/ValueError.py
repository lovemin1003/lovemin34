# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 20:37:22 2020

@author: COM
"""

try:
    n=input("숫자를 입력하시오.")
    n=int(n)
except ValueError:
    print("정수가 아니군.")

print(n)    
    