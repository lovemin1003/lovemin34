# -*- coding: utf-8 -*-
"""
Created on Mon Jan 13 22:54:55 2020

@author: COM
"""

infile=open("포켓몬.txt","r")

for a in infile:
    a=a.rstrip() # 줄바꿈 문자 제거
    
    print(a)
infile.close()    

