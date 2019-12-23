# -*- coding: utf-8 -*-
"""
Created on Tue Dec 24 00:25:49 2019

@author: COM
"""

poke='watashiwa baromidesu 21344'

mon={'alpha':0, 'digit':0,'space':0}
for i in poke:
    if i.isalpha():
        mon['alpha']+=1
    if i.isdigit():
        mon['digit']+=1
    if i.isspace():
        mon['space']+=1    
print(mon)        
        
    