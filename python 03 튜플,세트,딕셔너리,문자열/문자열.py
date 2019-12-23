# -*- coding: utf-8 -*-
"""
Created on Mon Dec 23 23:34:07 2019

@author: COM
"""

poke="찌르성게"

a=poke[0:2]+poke[2:4]
print(a)
print()

"글자 수정"
a="상한"+poke[2:4]
print(a)
print()

q="coral"
w="sonata"

"""q는 w의 뒤에 있는가?"""
print(q>w)
print()

q="alpha"
w="123"
e="megal69"

"""알파벳으로만 되어있는가?"""
print(q.isalpha())
print(w.isalpha())
print(e.isalpha())
print()

"""숫자로만 되어있는가?"""
print(q.isdigit())
print(w.isdigit())
print(e.isdigit())
print()

"""부분 문자열 검색(앞부분)"""
print(e.endswith("megal"))

"""부분 문자열 검색(뒷부분)"""
print(e.endswith("69"))

"""공백 제거"""

poke="  오늘도 실전 6마리나 만들었다... 원래는 3마리로 끝내려고 했는데. ㄷㄷ  "

"""왼쪽 공백 제거"""
print(poke.lstrip()+'공부합시다.')
"""오른쪽 공백 제거"""
print(poke.rstrip()+'공부합시다.')
"""양쪽 공백 제거"""
print(poke.strip()+'공부합시다.')