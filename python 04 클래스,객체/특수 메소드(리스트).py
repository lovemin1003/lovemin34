# -*- coding: utf-8 -*-
"""
Created on Fri Dec 27 00:03:11 2019

@author: COM
"""

class poke:
    def __init__(self):
        self.data=[]
    def add(self,x):
        self.data.append(x)
    def add2(self,x):
        self.add(x)

p=poke()
p.add2('더시마사리')
p.add2('삼삼드래')
p.add2('몰드류')

print(p.data)    