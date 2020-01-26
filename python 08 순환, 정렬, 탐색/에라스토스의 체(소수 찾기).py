# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 21:39:41 2020

@author: COM
"""

def erato(n):
    mul=set()
    for i in range(2,n+1):
        if i not in mul:
            yield i
            # i가 mul 세트에 없을 경우 함수의 반환 값으로 i를 출력한다.
            # 파이썬은 함수 안에 yield 키워드가 등장하먄 그 함수를 제너레이터로 인식함.
            mul.update(range(i*i, n+1,i))

print(list(erato(200)))            