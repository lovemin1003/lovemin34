# -*- coding: utf-8 -*-
"""
Created on Sat Dec 21 14:24:14 2019

@author: COM
"""

string=input('문자열을 입력하시오:')

count={}

for i in string:
    count[i] = count.get(i,0)+1


c=list(count.items())
c.sort()
print(c)    
    