# -*- coding: utf-8 -*-
"""
Created on Tue Jan  7 00:25:04 2020

@author: COM
"""

import random

my=['천국','지옥']

while(True):
    res = input("천국갈까? 지옥갈까? 알고 싶으면 y를 누르시오.")
    if res=='y':
        a=random.choice(my)
        print('당신은 사후',a,'으로 갈 것 같군.')
    else:
        break