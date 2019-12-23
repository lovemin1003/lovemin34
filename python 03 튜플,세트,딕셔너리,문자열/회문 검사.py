# -*- coding: utf-8 -*-
"""
Created on Tue Dec 24 00:09:38 2019

@author: COM
"""

def check(a):
    q=0
    w=len(a)-1
    while True:
        if q>w:
            return True
        
        if a[q]!=a[w]:
            return False
        q+=1
        w-=1
   

a=input("입력:")
a.replace(" ","")
if(check(a)==True):
    print('회문입니다.')
else:
    print('회문 아님.')
    
        
    