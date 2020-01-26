# -*- coding: utf-8 -*-
"""
Created on Sun Jan 19 22:28:37 2020

@author: COM
"""

def sel(alist):
    for i in range(len(alist)):
        min = getmin(alist,i)
        temp = alist[min]
        alist[min] = alist[i]
        alist[i] = temp

def getmin(alist,start):
    min = start
    for i in range(start+1, len(alist)):
        if alist[i] < alist[min]:
            min = i
           
           
    return min


alist=[7,2,1,8,6,11,9]
sel(alist)
print("결과:",alist)  

def search(list,value):
    low = 0
    high = len(list)-1
    
    
    while low <= high:
        middle = (low+high)//2
        if list[middle] > value: 
            high = middle-1
        elif list[middle] < value: 
            low = middle+1
        else:
            return middle
    return -1

print("6은",search(alist,6)+1,"번째 인덱스에 있음.")    
        