# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 21:26:11 2020

@author: COM
"""

def fib(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return fib(n-1)+fib(n-2)

n=int(input("정수 입력좀."))
print(n,fib(n))    