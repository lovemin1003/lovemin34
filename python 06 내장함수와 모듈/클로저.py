# -*- coding: utf-8 -*-
"""
Created on Mon Jan  6 22:09:12 2020

@author: COM
"""
# 함수에 의하여 반환되는 함수
def add(a):
    def ad(b):
        return a+b
    return ad

func = add(30)
print(func(20))