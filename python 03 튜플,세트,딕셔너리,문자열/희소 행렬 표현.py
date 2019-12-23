# -*- coding: utf-8 -*-
"""
Created on Sat Dec 21 14:34:07 2019

@author: COM
"""

matrix={(1,2):1,(2,2):2}

for x in range (3):
    for y in range (3):
        print(matrix.get((x,y),0),end=" ")
    print()    