# -*- coding: utf-8 -*-
"""
Created on Mon Dec 23 23:51:52 2019

@author: COM
"""

poke="dragon,poison,fairy"

mon=''

for i in poke.split(','):
    mon+=i[0]

print(mon)    