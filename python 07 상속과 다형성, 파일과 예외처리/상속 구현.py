# -*- coding: utf-8 -*-
"""
Created on Wed Jan  8 21:25:36 2020

@author: COM
"""

class car: # 자동차 클래스
    def __init__(self, make, model, color, price):
        self.make= make
        self.model= model
        self.color= color
        self.price= price
    
    def setmake(self, make): # 설정자 클래스
        self.make = make
    def getmake(self, make): # 접근자 클래스
        return self.make

    def getdesc(self):
        return str(self.make)+str(self.model)+str(self.color)+str(self.price)
    
class truck(car): # 트럭 클래스이지만 자동차(클래스)로부터 상속받음.
    def __init__(self, make, model, color, price,payload):
        super().__init__(make, model, color, price) # 자동차(클래스) 생성자 호출
        self.payload=payload
    def setpayload(self,payload):
        self.payload=payload
    
def main():
    a = truck("프리크","드래곤","진청색",1000,100)
    a.setmake("썬더")
    print(a.getdesc())

main()    
    