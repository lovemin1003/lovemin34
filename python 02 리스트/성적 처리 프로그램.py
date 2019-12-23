# -*- coding: utf-8 -*-
"""
Created on Thu Dec 19 20:54:36 2019

@author: COM
"""


student=int(input("학생 수:"))
b=[]
c=0
for i in range(student):
    a=int(input("너의 성적은?"))
    b.append(a)
    c+=a
    if b[i]>b[i-1]:
        e=b[i]
    
d=c/student

print("성적 평균:",d)
print("최고 점수:",e)

    
    