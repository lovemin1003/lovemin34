# -*- coding: utf-8 -*-
"""
Created on Thu Dec 19 21:01:36 2019

@author: COM
"""
a=[]
while True:
    b=input("강아지의 이름을 입력하시오.")
    a.append(b)
    if b=="":
        break

a.insert(0,"피나")
for i in range(len(a)-1):
    print(i+1,"번째 강아지:",a[i])

    
    