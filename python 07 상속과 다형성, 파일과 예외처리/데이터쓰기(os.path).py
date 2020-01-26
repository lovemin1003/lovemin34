# -*- coding: utf-8 -*-
"""
Created on Mon Jan 13 07:22:02 2020

@author: COM
"""

import os.path

out = open("포켓몬.txt","w")

if os.path.isfile("포켓몬.txt"):
    print("같은 이름의 파일이 존재함")
else:
    out.write("창파나이트 타입: 격투\n")
    out.write("마휘핑 타입: 페어리\n")
    out.write("고릴타 타입: 풀\n")
    out.write("백솜모카 타입: 풀\n")

out.close()    
    