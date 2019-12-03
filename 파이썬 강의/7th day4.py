# -*- coding: utf-8 -*-
"""
Created on Sat Mar  9 11:18:32 2019

@author: 5
"""

#1: 1-500까지의 숫자 중에서 2,5,6의 배수를 구하시오.
b=0
for a in range (1,501):
    if a % 2 == 0 or a % 5 == 0 or a% 6 == 0:
      b+=a
      
      
      
      
print(b)     

def DashInsert():
     print('원하는 숫자를 누르시오:')
     num = input()
     ans = ''+num[0]
     sta = 0
     nex = 1
     while nex < len(num):
         tonum1 = int(num[sta])
         tonum2 = int(num[nex])
         if tonum1 % 2 == tonum2 % 2 and tonum1 % 2 ==0:
             ans+='*'
             ans+=num[nex]
         
         elif tonum1 % 2 == tonum2 % 2 and tonum1 % 2 ==1:
             ans+='-'
             ans+=num[nex]
    
         else:
             ans+=num[nex]
             
         sta+=1
         nex+=1
     return ans
 
print(DashInsert())





w=[]

for q in range (1,13):
    w.append(q)
    
print(w) 


z=[]
for r in range (0,len(w)):   
    
    if w[r] % 4 == 1:
        z.append([w[r],w[r+1],w[r+2],w[r+3]])
      
        
print(z)   

#정답란

y = [[i+4*(j) for i in range(1,5)] for j in range(0,3)]

print(y)


 





















