# -*- coding: utf-8 -*-
"""
Created on Sun Feb 24 09:01:55 2019

@author: 5
"""

#조건문:  if, if-else, if-elif(else lf), if-elif-else

'''
if조건문:
    수행할 문장 1,2...
========================
if조건문:
    수행할 문장 1,2...
    
    else조건문:
    수행할 문장 1,2...
  =======================  
if조건문:
    수행할 문장 1,2...
    
    elif조건문:
    수행할 문장 1,2...
  =======================  
if조건문:
    수행할 문장 1,2...
    
    elif조건문:
    수행할 문장 1,2...
    
    else조건문:
    수행할 문장 1,2...

'''


clan = 'granblue'
if clan == 'angel Feather':
    print('엔페')
    
elif clan == 'aqua force':
   print('아쿠포')
else:
    print('너의 클랜은?')
    
    print("="*88)

print('뭐든 입력하시오.')
score1 = input()  #모든 값 입력

print('점수:')   
score = int(input())    #값(정수) 입력

if score > 100:
    print('주작 ㄴㄴ함. \n 100점 만점이라고!')
    
    
elif score >= 90:
    print('평가 a')
    
elif score >= 80:
    print('평가 b')
    
elif score >= 70:
    print('평가 c')

elif score >= 60:
    print('평가 d')
    
else:
    print('님 인간임?')


















