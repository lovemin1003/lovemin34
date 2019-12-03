# -*- coding: utf-8 -*-
"""
Created on Sun Mar 10 10:45:52 2019

@author: 5
"""

'''
숫자를 입력받았을 경우 0-9가 모두 하나씩 들어가면 true를,
아니면 false를 출력하시오.

'''
#내 방식(ㄹㅇ루다가 급으로 무식...)
a=input()
listc = list(a)
print(listc)

q0=0
q1=0
q2=0
q3=0
q4=0
q5=0
q6=0
q7=0
q8=0
q9=0
q10=0
q11=0



for b in range (0,len(listc)):
    if listc[b]=='0':
        q0=1
    elif listc[b]=='1':
        q1=1  
    elif listc[b]=='2':
        q2=1  
    elif listc[b]=='3':
        q3=1  
    elif listc[b]=='4':
        q4=1  
    elif listc[b]=='5':
        q5=1      
    elif listc[b]=='6':
        q6=1      
    elif listc[b]=='7':
        q7=1      
    elif listc[b]=='8':
        q8=1      
    elif listc[b]=='9':
        q9=1     
if q0==1 and q1==1 and q2==1 and q3==1 and q4==1:
  q10=1
        
if q5==1 and q6==1 and q7==1 and q8==1 and q9==1:
  q11=1
  
if q10==1 and q11==1 and len(listc) == 10:
    print('트루')
else:
    print('아님.')        
    
#답안

def DN():
  ans = list()
  num = input() #1234567890, 123456, 567890123.
  listn = num.split(' ')
  for i in listn:
      if len(i) == 10:
          for j in range(len(i)):
              if i[j] in ans:
                  ans.append('거짓')
          ans.append('사실')
        
      else: 
          ans.append('거짓')  
        
  return ans
print(DN())   

