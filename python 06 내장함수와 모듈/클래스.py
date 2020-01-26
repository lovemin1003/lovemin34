# -*- coding: utf-8 -*-
"""
Created on Mon Jan  6 22:25:57 2020

@author: COM
"""

class book:
    title=''
    pages=0
    
    def __init__(self, title='', pages=0):
        self.title = title
        self.pages = pages
        
    def __str__(self):
        return self.title
    
    def __add__(self, other):
        return self.pages + other.pages

a=book('너의 이름은', 345)
b=book('월간 무사도',300)
print(a+b)    