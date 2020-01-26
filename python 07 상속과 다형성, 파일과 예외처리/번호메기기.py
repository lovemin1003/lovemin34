# -*- coding: utf-8 -*-
"""
Created on Tue Jan 14 22:40:23 2020

@author: COM
"""

infile=open("포켓몬.txt")
outfile=open("포켓몬순서.txt","w")
i=1
for line in infile:
    outfile.write(str(i)+":"+line)
    i+=1

infile.close()
outfile.close()    