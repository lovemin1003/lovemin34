# -*- coding: utf-8 -*-
"""
Created on Tue Dec 24 22:13:46 2019

@author: COM
"""

class tv:
    def __init__(self,channel,volume, on):
        """변수 정의"""
        self.channel = channel
        self.volume = volume
        self.on = on
    def show(self):
        print("채널:",self.channel,"음량:",self.volume,self.on)
    def setchannel(self,channel):
        self.channel=channel
    def getchannel(self):
        return self.channel
"""객체 생성"""
t=tv(38,10,True)
print(t.channel)
t.show()
"""객체의 멤버에 접근할 경우 멤버 연산자(.)를 사용함."""
t.setchannel(28)
t.show()    