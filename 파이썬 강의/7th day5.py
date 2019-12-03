# -*- coding: utf-8 -*-
"""
Created on Sat Mar  9 12:10:05 2019

@author: 5
"""

'''
2: 오각수란 일정한 물건으로 오각형 형태로 물건을 배치했을 때 쓰이는
물건의 합계가 되는 수를 말함.
오각수 한 쌍이 있을 때 이 둘의 차와 합이 둘 다 오각수라고 할때
이 둘의 차가 최소가 되는 수를 구하시오.
'''

import math as m
def penta(n):
    n = abs(n)
    ans =(m.sqrt(1+24*n)+1)/6
    if ans == int(ans):
        return True    
    else:
        return False 

def find():
  i = 1
  result = 0
  not_found = True
  while not_found:
      i+=1
      n = (i*(3*i-1)/2)
      for j in range(i, 1, -1):
          m=(j*(3*j-1)/2)
          if(penta(n-m) & penta(n+m)):
              result = abs(n-m)
              print(result)
              break
          
            
  return result

print(find())
print('2')








