# -*- coding: utf-8 -*-
"""
Created on Thu Dec 19 21:56:24 2019

@author: COM
"""

d=[(a,b,c) for a in range(1,100) for b in range(1,100) for c in range(100)
if a**2+b**2==c**2]

print(d)