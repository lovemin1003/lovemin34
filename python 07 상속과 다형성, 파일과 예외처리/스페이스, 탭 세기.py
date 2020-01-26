# -*- coding: utf-8 -*-
"""
Created on Tue Jan 14 22:29:38 2020

@author: COM
"""

def parse(path):
    infile = open(path)
    space = 0
    tabs = 0
    for line in infile:
        space += line.count(' ')
        tabs += line.count('\t')
    infile.close()
    
    return space,tabs

filename = ("포켓몬.txt")
space, tabs=parse(filename)
print("스페이스:",space,"탭:",tabs)
    