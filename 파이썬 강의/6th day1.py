# -*- coding: utf-8 -*-
"""
Created on Sun Mar  3 09:11:34 2019

@author: 5
"""
'''
while True:
    ans = input()
    if @ == 5:
        break
해당 반복문을 멈추기 위해 @ 안에 들어가야 할 것은?    
'''
#내 방식
while True:
    ans = input()
    if ans == '5':
        break
#답안    
while True:
    ans = input()
    if int(ans) == '5':
        break    

print('='*90)

'''    
for a in range (3,4):
  for b in range(c,d):
      print(a*b)
결과 값이 15,18,21,24,27이 나오기 위해
c,d 안에 넣어야 하는 것은?    
'''  
for a in range (3,4):
  for b in range(5,10):
      print(a*b)

#5,10
    
print('='*90)

'''

g = [[c,d] for c in range(0,5) for d in range (0,3)]

g에 몇 개의 요소값이 있을까?

'''
g = [[c,d] for c in range(0,5) for d in range (0,3) ]
print(g)

print('='*90)

#15개

'''

h = [[2,3],[7,5],[8,9]]
h.sort()
위의 결과값은?, 그리고 정렬 기준은?

'''
h = [[2,3],[7,5],[1,9]]
h.sort()
print(h)

print('='*90)

#리스트 별 첫 위치값이 낮은 것 부터 오름차순으로 정렬됨.
#같을 경우에는 다음 위치값을 비교함.

