# -*- coding: utf-8 -*-
"""
Created on Sat Mar  9 09:12:25 2019

@author: 5
"""

def mul(a,b):
    return a*b

def add(a,b):
    return a+b

def cal(a,b,c):
    if c =='+':
        add(a,b)
    elif c =='*':
        mul(a,b)
        
print(cal(2,3,'+'))        
print(add(2,3))

def gcd(m,n): #최대공약수
  
   while m % n != 0:
            oldm = m
            oldn = n
            
            m = oldn
            n = oldm % oldn
   return n

class Fraction(a,b):
     def _init_(self, top, bottom):
         self.num = top
         self.den = bottom
         
     def show(self):
         print(self.num,"/",self.den)
         print(self.num/self.den)
                  
     def _float_(self):
         return float(self.num/self.den)
     
     def _add_(self, b):
         newNum = self.num*b.den + self.den * b.num
         newDen = self.den*b.den
         commonD = gcd(newNum, newDen)

         return Fraction(newNum,newDen)     
     
myf_add1 = Fraction(3,5)
print(float(myf_add1)  
myf_add2 = Fraction(8,4)   
frac_add = myf_add1 + myf_add2
Frac_add.show()
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         