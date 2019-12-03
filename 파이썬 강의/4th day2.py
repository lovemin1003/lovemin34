# -*- coding: utf-8 -*-
"""
Created on Sun Feb 24 10:32:44 2019

@author: 5
"""

'''
반복문: 코드를 반복 수행하는 것. 연산의 길이를 지정할 수 있는 
for문과, 조건 만족시 계속 반복 수행을 도와주는 while이 있음.

while의 경우 사용자가 반복의 범위를 제한적으로 할 수 밖에 없어서
break 등의 조건문으로 반복을 탈출한다.

예시:
    count = 1
    while True:
        count +=1
        if count == 100:
            break

num = 1
sum = 0
while num < 11:
    sum += num
    num += 1
print(sum)
'''

count = 1
while True:
        count +=1
        if count == 100:
            break
        
num = 1
sum = 0
while num < 11:
    sum += num
    num += 1
print(sum)

print("="*88)

a=0
while True:
   a+=1
   print('0'*a)
   if a>=5:
       break
   
print("="*88)
    
b=5
while True:
   
   print('0'*b)
   b-=1
   if b<=0:
       break    
   
print("="*88)
    
#print에 +를 붙였을 때
c=5   
d=0
while True:
   c-=1
 
   d+=1
   print(' '*c+'0'*d)
   
   
   if d>=5:
       break

print("="*88)
    
#print에 ,를 붙였을 때
e=5
f=0
while True:
   e-=1
 
   f+=1
   print(' '*e,'0'*f)
   
   
   if f>=5:
       break

print("="*88)

i=5
j=0
while True:
   
 
   
   print(' '*j+'0'*i)
   i-=1
   j+=1
   if j>=5:
       break


print("="*88)

g=4
h=1
while True:
   
   print(' '*g+'0'*h)
   g-=1
 
   h+=2
   
   if h>=11:
       break

print("="*88)

k=0
l='6'
m='9'
n='0'
while True:
    print((l+m)*8+l)
    k+=1
    n=l
    l=m
    m=n
    if k>=9:
        break
    
print("="*88)  


print("돈 주세요.")  
money = int(input())

    
while True:
    print("먹고 싶은거 고르시오.")
    print("1:하늘보리")
    print("2:카카오닙스차")
    
    bev = input()
    
     
    
    if bev == '1':
        money = money-1500
        print('하늘보리 겟!,{0}원 남음.'.format(money))
        if money <= 0:
              break
          
   
                
                
    elif bev == '2':
        money = money-1700
        print('카카오닙스차 겟!,{0}원 남음.'.format(money))
        if money <= 0:
              break

    else:
     print('잘못 누르심.')
     
   
    
    
    
    