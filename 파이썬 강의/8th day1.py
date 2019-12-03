# -*- coding: utf-8 -*-
"""
Created on Sun Mar 10 09:08:52 2019

@author: 5
"""

'''
while문이 멈추는 경우:

    1. 조건식이 거짓이거나 거짓이 되는 경우.
    2. 강제로 멈추는 경우(break)
    
    
     
'''

'''
문자열을 입력받아 같은 문자가 연속적으로 반복되는 경우에 그
 반복 횟수를 표시하여 문자열을 압축하여 표시해보자.
 
입력 예시: aaabbcccccca
출력 예시: a3b2c6a1

'''
#정답란

def com():
 a = input()
 lists = list(a)
 ans = lists[0]
 cou = 0




 
    
 for b in range (0,len(lists)):
    if lists[b]==ans[-1]:
        print(lists)
        print(ans[-1])
        print(ans[0])#[-1]이랑 똑같이 나옴.
    
        cou+=1
        
        
    else:
        ans += str(cou)
        ans += lists[b]
        cou=1
 ans += str(cou)    
 return ans   
        
print(com())

'''
 전체 문자의 반복을 세어라.

 예시:qqqwwewe->q3w3e2
'''

#내 방식
def gg():
    q=input()
    listw=list(q)
    listw.sort()
    ee = listw[0]
    
    count=1
 
    for t in range (1,len(listw)):
       if listw[t-1]==listw[t]:
           count += 1
          
           
       else:
           ee += str(count)
           ee += listw[t]
           count=1
    ee += str(count)     
    return ee
   

print(gg())  

#정답

def gg2():
    q=input()
    listw=list(q)
    listw.sort()
    ee = listw[0]
    
    count=1
 
    for t in range (1,len(listw)):
       if listw[t-1]==listw[t]:
           count += 1
          
           
       else:
           ee += str(count)
           ee += listw[t]
           count=1
    ee += str(count)     
    return ee
   

print(gg2())  

    
   
























