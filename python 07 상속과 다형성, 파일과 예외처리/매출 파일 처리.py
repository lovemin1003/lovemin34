# -*- coding: utf-8 -*-
"""
Created on Mon Jan 13 22:40:29 2020

@author: COM
"""

infile=open("판매량.TXT","r")
outfile=open("매출.TXT","w")

sum=0
count=0

# 입력 파일에서 한 줄을 읽어서 합계를 계산한다.
for a in infile:
    day = int(a)
    sum=sum+day
    count=count+1
    
outfile.write("총매출:"+str(sum)+"\n")
outfile.write("평균 일매출:"+str(sum/count)+"\n")

infile.close()
outfile.close()
  