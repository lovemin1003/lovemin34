# -*- coding: utf-8 -*-
"""
Created on Mon Jan  6 23:07:32 2020

@author: COM
"""

import random

poke=["드래펄트","삼삼드래","갈가부기"]

print(random.choice(poke))

pokemon=[['창파나이트'],['따라큐'],["밀로틱"]]
random.shuffle(pokemon) # 리스트를 무작위로 섞어줌.
print(pokemon)

print(random.randrange(0,10,1)) # range(start, stop, step) 구간 내 무작위로 요소를 생성함.
