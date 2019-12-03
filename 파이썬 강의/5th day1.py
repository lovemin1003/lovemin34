# -*- coding: utf-8 -*-
"""
Created on Sat Mar  2 09:04:52 2019

@author: 5
"""



 #for 변수 in ??:의 ??에 들어갈 수 있는 것들
 
''' 
리스트, 튜플, 집합, 문자열, range(숫자, 숫자)

이들의 공통점은 길이를 가지고 있으며, 범위가 존재함.

딕셔너리는 안 됨.

'''


 



a = (1,2,3)
print(a[1])
print('='*100)

#b={1:2, 3:4, 5:6} 딕셔너리 출력법
b=[(1,'오라클은'),(2,'역시'),(3,'티어'),(4,'오역티')]
c={}
for first, last in b:
    c.update({first:last})
    print({first:last})
    
    
print('='*100)
    #99단
    
for d in (3,5):
    for e in range(1,10,1):
     print('{0} X {1} = {2}'.format(d,e,d*e))

print('='*100)

#소수(1과 자신만을 가지는 수) 찾기(개인적으로 한 방법)


f=100

print(2)
print(3)
print(5)
print(7)
for g in range(2,f+1):
    if g % 2!=0 and g % 3!=0 and g % 5!=0 and g % 7!=0:
        print(g)
        
print('='*100)        
        
#소수(1과 자신만을 가지는 수) 찾기(수강 중에 생각해낸 방법)
        
h=100
count=0
l=0
if h > 1:
    for j in range(2,h+1):
        if j == 2:
            count+=1
            print(j,':','현재 소수',count,'개')
            l+=j
        else:
            for k in range (2,j+1):
                if j == k:
                    count+=1
                    print(k,':','현재 소수',count,'개')
                    l+=k
                    
                
                elif j % k ==0:
                    break
                
print('소수의 합은 ',l)

print('='*100)     

#소수(1과 자신만을 가지는 수) 찾기(강사님의 답안)

m=100
count=0

if m > 1:
    for i in range(2,m+1):
        if i == 2:
            count+=1
            print(i,':','현재 소수',count,'개')
           
        else:
            for k in range (2,i):
                
                    
                
                if i % k ==0:
                    break
                
                elif k == i-1:
                    count+=1
                    print(k+1,':','현재 소수',count,'개')
                    
print('='*100)     
q=100                    
p=0
for o in range (1,q+1):
    if o % 2 != 0:  
       p+=o 

print(p)             
rr=0                    
for r in range (1,11):
  if r==1:
      pass#따돌리기, if문에 사용됨.
  else:
      print(r)
      rr+=1   
      
print(r)
print('='*100) 
   
ss=0
for s in range (1,11):
  if s == 1:
      continue#반복문의 반복을 넘을때 쓰임.
  else:
      print(s)
      ss+=1

print(ss)
print('='*100) 


#기존 방식
u = []

for t in range(1,11):
  u.append(t)

print(u)  

print('='*100) 

#파이썬의 방식. 메모리를 효율적으로 쓸 수 있으며 처리가 빠름.

w = [v for v in range(1,11)]
print(w)
#곱셈
w = [v*x for v in range(1,4) for x in range(1,4)]
print(w)
#덧셈
w = [v+x for v in range(1,5) for x in range(1,4)]
print(w)

w = [v for v in range(1,5) if v % 2==0]
print(w)
#과제물1(제곱 구하기(내 방법))
w = [v*v for v in range(1,6) ]
print(w)
#과제물1(제곱 구하기(정답))
w = [v**2 for v in range(1,6) ]
print(w)
#과제물2(2의 제곱 구하기(내 방법, 정답))
w = [2**v for v in range(0,7) ]
print(w)


#윤년 계산법
year = 2020
if year % 4 == 0:
    if year % 100 == 0:
         if year % 400 == 0:
           print(year,'년은 윤년임.')
         else:
           print(year,'년은 윤년이 아님.')
    else:       
     print(year,'년은 윤년임.')
else:
    print('{0} 년은 윤년이 아님.'.format(year))
    
























