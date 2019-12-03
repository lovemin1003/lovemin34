# -*- coding: utf-8 -*-
"""
Created on Sat Mar  9 10:02:53 2019

@author: 5
"""

a = 3
b = 6
def print_num(a):
    if str(a) == a:
        b = 5
        print('틀림')
        print(b)
    else:
        b = 7
        print(a)
        print(b)
        
print_num('4')
print('%'*90)
print_num(4)
print('%'*90)
print(b)        
print('%'*90)

#객체, 클래스, 인스턴스

class Teacher:
    def _init_(self, sub, time):
        self.subject = sub
        self.classTime = time

kang = Teacher


class voacinfo:
    name = 'tono hikaru'
    name1 = 'tsumugi risa'
    def info(self):
        print('성우명:'+self.name)
        print('성우명:'+self.name1)

intro = voacinfo()
    


print(intro.info())

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    