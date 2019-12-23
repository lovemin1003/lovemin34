# -*- coding: utf-8 -*-
"""
Created on Thu Dec 19 21:31:49 2019

@author: COM
"""

a=["피나","우리","단델"]

b=sorted(a)
print(b)

c=[word[-1] for word in a]

print(c)

b="우리 주전 포켓몬: 더시마사리"
c=sorted(b.split())
c1=b.split()
c2=b.split(":")

print(c[0])
print(c1)
print(c2)


"""deepcopy() 내장 함수도 리스트를 받아서 복사본을 생성하여 반환한다."""
from copy import deepcopy

d=[1,2,3,4,5]
e=deepcopy(d)
print(e)

list1=[3,5,7]
list2=[i+10 for i in list1]

print(list2)

