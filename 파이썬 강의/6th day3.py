# -*- coding: utf-8 -*-
"""
Created on Sun Mar  3 11:05:28 2019

@author: 5
"""

#Docstring == Document string

def order(chara):
    
 '''
      이 함수는 버뮤다 애니에 나오는 캐릭을 토대로 작성함.
      order 함수를 실행하고 menu에는 원하는 캐릭 이름을 문자열로 
      넣으면 됨.


 '''

 return "{0} 좋아하는구나. ㅎㅎ".format(chara)

print(order("피나"))

import math





def quadratic_formula(a,b,c):
    x_upper = -b + (b**2-4*a*c) **(1/2)
    
import cmath
    
def quadratic_formula(a,b,c):
    x_upper = -b + cmath.sqrt(b**2-4*a*c)
    x_lower = -b - cmath.sqrt(b**2-4*a*c)
    
    return (x_upper/2*a, x_lower/2*a)

print(quadratic_formula(2,3,5))
    
print(quadratic_formula(1,2,1))   

#j는 복소수(실수와 허수의 합)를 의미 

'''
거스름돈은 반환
메뉴는 500원으로 동일
m은 돈, n은 물건 수량
'''
def change(m,n):
    if m-n*500 >= 0:
     return m-n*500
    else:
        return '어디서 약을 팔아?'

print(change(4000,10))
    

'''

함수 형태 4가지, 매개변수의 유무와 return의 유무

1.둘 다 있을 시
def name(z):
    return z

2.둘 다 없을 시    
def name():    
    print()
    
3.매개변수만 있을 경우
def name(z):
    print(z)
    
4.return만 있을 시
def name():
     return zet
     
'''    
    
    
'''    

python의 sum이란 함수는 어떻게 만들어질까?

sum이란 함수는 여려개의 값을 전달받아 총 합을 구한다.
함수 안에 그때마다 여러개의 값을 전달하고 싶으면
매개변수명 앞에 *을 붙인다.





def sum(*all):
    for i in range(0,len(*all))
     
    return
'''    
def sum(*all):
 a,b,c = all
 return a,b,c

print(sum('소나타', '캐로', '카논')) 

def sum(*all):
 d=[]
 d.append(all)
 return d

print(sum('소나타', '캐로', '카논'))   

'''

**kwargs는 값을 지정할 때 쓰임.

def name(**abc):
    return abc
    
name(init = '세레나')    

'''  
    
def find_min_idx(a): #[1,8,4,5,3,2,7,9,6]
    n= len(a) #n=9
    min_idx = 0
    for i in range(1,n): # range(1,9) i=2
        if a[i] < a[min_idx]: # a[2]<[0]
            min_idx = i
    return min_idx #0

def sel_sort(a): #[1,8,4,5,3,2,7,9,6]
    result= []
    while a: #[1,8,4,5,3,2,7,9,6]
        min_idx = find_min_idx(a)
        value = a.pop(min_idx)
        result.append(value)
    return result

print(sel_sort([8,5,4,1,3,2,7,9,6]))  

'''

범위는 1-20까지. 3 또는 5의 배수를 저장한 리스트를 출력하고
출력한 리스트의 요소 총 합을 구하라  
'''


            
go = [a for a in range(3,21,3) ]
print(go)  

zo = [b for b in range(5,21,5)]
print(zo)  

for c in range (0,len(go)):
    for d in range (0,len(zo)):
        if go[c-1] == zo[d-1]:
            zo.pop(d)         

e=[]
g=0
for f in range (1,21):
    if f%3==0 or f%5==0:
        e.append(f)
        g+=f
        

print(e)
print(g)

'''

포메는 암호 생성을 하려고 한다. 암호의 규칙은 다음과
홀수 뒤에는 % 짝수에는 * 
7의 배수 뒤에는 $가 와야한다.
28의 경우에는 *$로 짝수+7의 배수 순서로
특수 문자가 입력되야 함.
만약 무작위 숫자가 주어지는 함수가 위와 같이 주어졌을시
암호문을 완성하시오.

예시: password = '28*$*35%$4*5%'
'''

import random

#내 방식(미완성)

password = ''
p=[]
n=[]
while True:
    if len(p)>10:
        print(p)
        print(n)
        break
    i = random.randint(1,50)
    if i%2 == 0 and i%7 == 0:
        password = '*$'
        p.append(password)
        n.append(i)
    elif i%2 != 0 and i%7 == 0:
        password = '%$'
        p.append(password) 
        n.append(i)
    elif i%2 == 0:
        password = '*'
        p.append(password)  
        n.append(i)
    elif i%2 != 0:
        password = '%'
        p.append(password)
        n.append(i)
        
r=[]        
 
for w in range (0,len(n)):   
 r.append(n[w])
 r.append(p[w])
 

      
      
      
      
      

print(r)

pas=''

    
for z in range (0,len(r),2):
    pas+= str(r[z])
    pas+= str(r[z+1])
    if len(pas)>10:
        break
    
print(pas)   
#답안
        
password = ''
        
while True:
    if len(password)>10:
        break
    i = random.randint(1,50)
    if i%2 == 0 and i%7 == 0:
        password += str(i)
        password += '*$'
        
    elif i%2 != 0 and i%7 == 0:
        password += str(i)
        password += '%$'
    elif i%2 == 0:
        password += str(i)
        password += '*'
    elif i%2 != 0:
        password += str(i)
        password += '%'      
        

print(password)


    