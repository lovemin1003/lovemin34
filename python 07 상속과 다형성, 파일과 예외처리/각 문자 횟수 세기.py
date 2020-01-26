# -*- coding: utf-8 -*-
"""
Created on Tue Jan 14 22:44:09 2020

@author: COM
"""

filename = ("포켓몬.txt").strip()
infile = open(filename,"r")

freqs={}

# 파일의 각 줄에 대해 문자를 추출함. 각 문자를 사전에 추가한다.
for line in infile:
    for char in line.strip():
        if char in freqs:
            freqs[char] += 1
        else:
            freqs[char] =1

print(freqs)
infile.close()            