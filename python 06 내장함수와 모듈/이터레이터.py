# -*- coding: utf-8 -*-
"""
Created on Mon Jan  6 21:52:58 2020

@author: COM
"""

class mc(object):
    # 생성자 메소드 정의
    def __init__(self, low, high):
        self.low = low
        self.high = high
    # 이터레이터 객체로서 자신을 반환함 
    def __iter__(self):
        return self
    # low가 high보다 크면 StopIteration 예외를 발생한다. 
    # 그렇지 않을시 다음 값을 반환.
    def __next__(self):
        if self.low > self.high:
            raise StopIteration
        else:
            self.low +=1
            return self.low - 1

a=mc(1,10)

for i in a:
    print(i, end=" ")        