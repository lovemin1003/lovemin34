# -*- coding: utf-8 -*-
"""
Created on Mon Jan  6 22:46:46 2020

@author: COM
"""
# 파이썬에서 예약되어 사용되는 단어
import keyword

name = input("변수 이름을 입력하시오:")
if keyword.iskeyword(name):
    print(name,"은 예약어입니다.")
    print("아래의 키워드의 전체 리스트")
    print(keyword.kwlist)
else:
    print(name,"은 사용할 수 있는 변수이름")    