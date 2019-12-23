# -*- coding: utf-8 -*-
"""
Created on Sat Dec 21 11:42:51 2019

@author: COM
"""

num={2,3,1,4,5,4}
"""세트는 자동 정렬, 중복 제거 기능이 있음"""
print(num)

if 1 in num:
    print("1 있음.")
    
e=set("banana") 
print(e)   
"""요소 추가"""
num.add(6)
print(num)
"""요소 제거"""
num.discard(5)
print(num)

num.remove(4)
print(num)

"""여러 요소를 넣을 수도 있음.(중복 제거는 덤)"""
num.update([4,5,6,7,8,9])
print(num)

number={1,2,3,4,5}
"""같은 집합인가?"""
print("같은집합:",num==number)

"""상위 집합인가?"""
print("상위집합:",num>=number)
print("상위집합:",num.issuperset(number))

"""부분 집합인가?"""
print("부분집합:",num.issubset(number))

"""집합 내 요소가 있는지?"""
print("집합 내 요소가 있는지?:",1 in number)

number1={3,4,5}
number2={1,2,3,6}

"""합집합"""
print(number1|number2)
print(number1.union(number2))

"""교집합"""
print(number1&number2)
print(number1.intersection(number2))

"""차집합"""
print(number1-number2)
print(number1.difference(number2))

"출력이 가능"
for i in e:
    print(i, end=" ")