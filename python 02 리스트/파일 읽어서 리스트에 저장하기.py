# -*- coding: utf-8 -*-
"""
Created on Thu Dec 19 22:10:43 2019

@author: COM
"""

data=[]

"""텍스트 파일의 인코딩을 ANSI로 설정하고 저장해야 정상적으로 리스트에 추가 가능"""
d=open("D:/이미지/프로그래밍 공부/python 02 리스트/구구.TXT","r")

print(d)    


"""파일에 저장된 모든 줄을 읽는다."""
for line in d.readlines():
    """줄바꿈 문자를 삭제한 후 리스트에 추가"""
    data.append(line.strip())

print(data)    