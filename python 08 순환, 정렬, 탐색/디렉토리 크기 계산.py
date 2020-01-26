# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 21:47:24 2020

@author: COM
"""

import os 
def cal(name):
    total = 0
    
    if os.path.isfile(name):
        total += os.path.getsize(name)
    else:
        file = os.listdir(name)
        
        for sub in file:
            total += cal(name+"\\"+sub)
            
    return total

name = input("디렉토리 입력:") # 우리.jpg
print(cal(name))        