# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 21:55:46 2020

@author: COM
"""

# 막대 from에 쌓인 n개의 원판을 막대(y)를 사용하여 막대(z)로 옮긴다.
def hanoi(n,x,y,z):
    if(n==1):
        print("원판 1을",x,"에서",z,"로 옮긴다.")
    else:
        hanoi(n-1,x,z,y);
        print("원판", n,"을",x,"에서",z,"로 옮긴다.")
        hanoi(n-1,y,x,z);

hanoi(5,'ㄱ','ㄴ','ㄷ')        