# -*- coding: utf-8 -*-
"""
Created on Tue Jan 14 23:12:41 2020

@author: COM
"""

file1=("우리.png")
file2=("티르아.png")

# 이진 파일 모드 사용
infile=open(file1,"rb")
outfile=open(file2,"wb")

# 입력파일에서 1024 바이트씩 읽어서 출력 파일에 쓴다.
while True:
    copy = infile.read(1024)
    if not copy:
        break
    outfile.write(copy)

infile.close()
outfile.close()
print(file1+"를 "+file2+"로 복사함.")    