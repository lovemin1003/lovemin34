# -*- coding: utf-8 -*-
"""
Created on Sat Dec 21 12:26:44 2019

@author: COM
"""

pokemon=dict()

pokemon['흥나숭']='우리'
pokemon['염버니']='승재'
pokemon['울머기']='단델'

main=input('스타팅 포켓몬을 고르시오.(8세대):')

a=pokemon.get(main,'??')

print(a)