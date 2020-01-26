# -*- coding: utf-8 -*-
"""
Created on Thu Dec 26 22:39:16 2019

@author: COM
"""

class stu:
    """생성자"""
    def __init__(self,name=None,age=0):
        self.__name=name
        self.__age=age
    """접근자"""    
    def getage(self):
        return self.__age
    
    def getname(self):
        return self.__name
    """설정자"""
    def setage(self,age):
        if age<0:
            self.__age=0
        else:
            self.__age=age
        
    def setname(self,name):
        self.__name=name
        

a=stu('우리',15) 
print(a.getname(),a.getage())     
  