# -*- coding: utf-8 -*-
"""
Created on Mon Jan  6 23:41:34 2020

@author: COM
"""

import time
print(time.time())

def fib(n):
    a,b=0,1
    while b<n:
        print(b, end=' ')
        a,b = b, a+b
    print()

start=time.time()
fib(100)
end=time.time()
print(end-start)     

print(time.asctime())#현재 날짜, 시간을 표시함.

t=(2018,1,23,10,34,4,0,0,0)# 특정날짜를 표시할 수도 있다.
print(time.asctime(t))

print(time.localtime())# 현재 날짜와 시간을 튜플 객체 형태로 반환한다.

#  결과값에서 연도나 월을 추출하여 사용할 수 있다.
a=time.localtime()
year=a[0]
print(year)
month=a[1]
print(month)

for i in range(1,11,1):
    print(i, end=' ')
    time.sleep(1)
    
print('빼액!')    