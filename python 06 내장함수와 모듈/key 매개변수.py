# -*- coding: utf-8 -*-
"""
Created on Sun Jan  5 22:16:29 2020

@author: COM
"""

print(sorted("de a kirby meta".split(), key=str.lower))

poke=[('드래펄트', 94),('따라큐', 84),('두랄루돈',98)]

print(sorted(poke, key=lambda poke: poke[1]))

#reverse로 오름(내림)차순 정렬을 할수 있게 함. True면 내림차순.

print(sorted(poke, key=lambda poke: poke[1], reverse=True))