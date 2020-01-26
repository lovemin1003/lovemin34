# -*- coding: utf-8 -*-
"""
Created on Tue Jan 14 23:24:17 2020

@author: COM
"""

infile = open("포켓몬.txt")
str = infile.read(13)
print("읽은 문자열:",str)
position=infile.tell() # 현재 위치를 알려줌.
print("현재 위치:",position)

position=infile.seek(0,0) # 파일의 처음으로 간다.(seek(): 위치 표시자 조작 함수)
str = infile.read(13)
print("다시 읽은 문자열:", str)
infile.close()