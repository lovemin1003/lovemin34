# -*- coding: utf-8 -*-
"""
Created on Wed Jan  8 21:55:35 2020

@author: COM
"""

class poke:
    def __init__(self,name):
        self.name=name
    def move(self):
        raise NotImplementedError("구현이 안 됬다는 예외를 발생시킴.")    
        

class dragon(poke):
    def __init__(self,name,level):
        super().__init__(name)
        self.level=level
    def move(self):
        return str(self.name+"의 다이드라군") # 부모 콜래스의 메소드를 오버라이드(재정의)함.


a=(dragon('드래펄트',30),dragon('어레곤',50)) 

for i in a:
    print(i.name," ",i.level)
    print(i.move())
        
    
        