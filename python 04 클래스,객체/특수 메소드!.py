# -*- coding: utf-8 -*-
"""
Created on Thu Dec 26 23:50:52 2019

@author: COM
"""

class poke:
    def __init__(self,name,level):
        self.name=name
        self.level=level
    def __str__(self):
        return "이름:%s, 레벨:%s" % (self.name,self.level)
    def __len__(self):
        return self.level
p=poke("몰드류",100)
print(p)  
print(len(p))  