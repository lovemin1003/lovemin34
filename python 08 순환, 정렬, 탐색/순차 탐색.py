# -*- coding: utf-8 -*-
"""
Created on Sun Jan 19 21:21:13 2020

@author: COM
"""

def seq(alist, item):
    pos = 0
    found = False
    
    while pos < len(alist) and not found: #  not found: found가 False일 경우
        if alist[pos] == item:
            found = True
        else:
            pos = pos + 1
    return found

poke=["이븐곰","로즈레이드","래비풋"]
print(seq(poke,"이븐곰")) # 리스트에 있을 경우
print(seq(poke,"에이스번")) # 없을 경우         