# -*- coding: utf-8 -*-
"""
Created on Mon Jan 13 23:09:12 2020

@author: COM
"""

from tkinter import *
from tkinter.filedialog import askopenfilename
from tkinter.filedialog import asksaveasfilename

readFile = askopenfilename()
if(readFile != None):
    infile = open(readFile,"r")

for line in infile:
    line=line.rstrip()
    print(line)

infile.close()    
    