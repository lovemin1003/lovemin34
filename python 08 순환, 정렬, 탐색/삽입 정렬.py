# -*- coding: utf-8 -*-
"""
Created on Sun Jan 19 21:01:32 2020

@author: COM
"""

def ins(list):
    for i in range(1,len(list)):
        key = list[i]
        j = i-1
        # 현재 값이 정렬된 부분의 값보다 작을시 정렬된 부분을 뒤로 한 칸 씩 
        # 이동시켜 빈 칸을 만들어준다.
        while j >=0 and list[j] > key:
            list[j+1] = list[j]
            j=j-1
            list[j+1] = key
            

alist=[7,2,1,8,6,11,9]
ins(alist)
print("결과:",alist)   