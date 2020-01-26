# -*- coding: utf-8 -*-
"""
Created on Sun Jan 19 20:21:43 2020

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
        