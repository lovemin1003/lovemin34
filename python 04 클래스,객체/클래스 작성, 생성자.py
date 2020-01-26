# -*- coding: utf-8 -*-
"""
Created on Tue Dec 24 22:01:40 2019

@author: COM
"""

class counter:
    """생성자. 여기서 객체의 초기화를 담당."""
    """생성자가 매개변수를 가지고 있으며 만약 사용자가 값을 전달하지
    않았으면 0으로 생각한다.(initValue)"""
    def __init__(self,initValue=0):
        self.count=initValue
    def reset(self):
        self.count=0
    def increment(self):
        self.count+=1
    def get(self):
        return self.count
    
"""초기값을 10으로 설정."""
a=counter(10)

a.increment()
print("a:",a.get())

"""초기값 설정 없음."""
a=counter()

a.increment()
print("a:",a.get())
    