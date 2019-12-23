# -*- coding: utf-8 -*-
"""
Created on Sat Dec 21 14:16:13 2019

@author: COM
"""

table={'우리':'울머기',
       '호브':'흥나숭',
       '승재':'염버니'}

a=input('입력:')

b=a.split()

result=''

for c in b:
    if c in table:
        result+=table[c]+" "
    else:
        result+=c

print(result)        
    