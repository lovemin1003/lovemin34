# -*- coding: utf-8 -*-
"""
Created on Mon Jan 13 23:06:05 2020

@author: COM
"""

infile=open("포켓몬.txt","r")

for a in infile:
    a=a.rstrip()
    word = a.split() # 공백문자로 문자열에서 단어들을 분리함.
    for w in word:
        print(w)
    
infile.close()    

line = "마휘핑, 한카리아스, 대검귀"
word = line.split(",") # 공백 이외의 다른 분리자를 사용하고 싶을 경우 
                       #  split() 메소드의 인수로 분리자로 사용되는 문자를 주면 됨.
print(word)
