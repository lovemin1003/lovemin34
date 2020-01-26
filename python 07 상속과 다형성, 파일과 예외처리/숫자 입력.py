# -*- coding: utf-8 -*-
"""
Created on Tue Jan 14 06:34:50 2020

@author: COM
"""

out = open("숫자.txt","w")

for i in range(5):
    out.write(str(i)+" ")

out.close()