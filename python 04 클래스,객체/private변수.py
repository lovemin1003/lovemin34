# -*- coding: utf-8 -*-
"""
Created on Tue Dec 24 22:28:01 2019

@author: COM
"""

class tv:
    def __init__(self,channel,volume, on):
        """변수명 앞에 __를 붙이면 인스턴스 변수를 
        private로 정의할 수 있음."""
        self.__channel = channel
        self.__volume = volume
        self.__on = on

t=tv(3,2,True)

print(t.__channel)        