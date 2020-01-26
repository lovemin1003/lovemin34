# -*- coding: utf-8 -*-
"""
Created on Mon Jan  6 22:03:04 2020

@author: COM
"""

def generator():
    yield '인텔리레온'
    yield '에이스번'
    yield '창파나이트'

for a in generator():
    print(a)
    