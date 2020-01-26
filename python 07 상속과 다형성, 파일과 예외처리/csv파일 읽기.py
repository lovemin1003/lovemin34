# -*- coding: utf-8 -*-
"""
Created on Tue Jan 14 22:50:20 2020

@author: COM
"""

poke = open("data4.csv","r") # 파일 열기

for line in poke.readlines(): # 파일 내 각 줄을 처리한다.
    line = line.strip() # 공백 문자 제거
    print(line) # 줄 출력
    parts=line.split(",") # 줄을 쉼표로 분리.
    for part in parts: # 각 줄의 필드를 출력
        print(" ",part)