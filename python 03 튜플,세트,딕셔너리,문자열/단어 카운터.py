# -*- coding: utf-8 -*-
"""
Created on Sat Dec 21 14:00:38 2019

@author: COM
"""


file = open("우리.TXT","r")

table=dict()
    

for line in file:
    words = line.split()
    
    for word in words:
        
        if word not in table:
            
            table[word] = 1
        else:
            table[word] +=1

print(table)    
