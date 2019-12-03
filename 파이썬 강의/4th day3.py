# -*- coding: utf-8 -*-
"""
Created on Sun Feb 24 12:30:57 2019

@author: 5
"""

'''
for 반복문은 순차반복을 하며 하나 하나씩 접근한다.

for 임시 변수 in 범위가 있는 자료형:
     range함수를 이용한 숫자 범위
     
     실행할 문장

'''

for a in {123, 23235, 345}:
  print(a)

for b in range (5,51, 5): #(a,b,c) a부터 b-1까지 c간격으로 
    #출력시킴.
    print(b)

for c in range (65, 91):
   print(chr(c))
   
   
  
for d in range (1,16): 
    
 if d%3==0:
    
    print(d)
    
for e in range (1,6):     
    for f in range (1,6):    
     print([e,f])
    
for g in range (5,9,3):     
    for h in range (1,10):    
     print('{0}X{1}={2}'.format(g,h,g*h))
      
    
    
    
    
    
    
    
    
    
    