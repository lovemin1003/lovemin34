# -*- coding: utf-8 -*-
"""
Created on Sun Jan 12 00:40:17 2020

@author: COM
"""

infile = open("포켓몬.TXT","r")
a = infile.read(10) # 앞의 문자 10개를 읽어 출력
print(a);
infile.close()
print()
# readline(): 한 줄을 읽어온다.
infile = open("포켓몬.TXT","r")
a=infile.readline()
print(a)
a=infile.readline()
print(a)
a=infile.readline()
print(a)
infile.close()
print()
# 파일의 크기가 크고 한줄씩 읽어서 처리하려면 다음과 같은 방법을 사용하는 것이 좋음.
infile = open("포켓몬.TXT","r")
a=infile.readline()
while a != "":
    print(a)
    a=infile.readline()
infile.close()   
print()

# 파일에서 문자열을 읽을때는 for 루프를 이용하여 파일 객체에 대하여 반복해도 됨.
infile = open("포켓몬.TXT","r")
for a in infile:
    a = a.rstrip()
    print(a)
infile.close()   





