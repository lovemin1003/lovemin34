# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 20:39:25 2020

@author: COM
"""

try:
    a=input("파일 이름을 입력하시오.")
    b=open(a,"r")
except IOError:
    print("그런 파일 없음.")
else:
    print(a)
    
    