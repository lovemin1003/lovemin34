# -*- coding: utf-8 -*-
"""
Created on Thu Dec 19 22:53:40 2019

@author: COM
"""

mine=[["O" for a in range(10)] for b in range(10)]

import random

for a in range(10):
    for b in range(10):
        if random.random()*10 < 4:
            mine[a][b] ="X"

for a in range(10):
    for b in range(10):

        print(mine[a][b],end=" ")
    print()    
        
    
