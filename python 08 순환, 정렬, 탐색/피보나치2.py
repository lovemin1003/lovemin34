# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 21:33:27 2020

@author: COM
"""

fibo={0:0,1:1} # 딕셔너리 활용

def fib(n):
    if not n in fibo:
        fibo[n]=fib(n-1)+fib(n-2)
    return fibo[n]
n = int(input("정수 입력:")) 
print(n,fib(n))   