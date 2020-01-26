# -*- coding: utf-8 -*-
"""
Created on Thu Jan 16 20:56:30 2020

@author: COM
"""

school1 = {'1반' : [150, 156, 179, 191, 199], '2반' : [150, 195, 179, 191, 199]} 
​
try: 
     for class_number, students in school1.items(): 
           for student in students: 
                if student > 190: 
                     print(class_number, '190을 넘는 학생이 있습니다.') 
                     # break # 바로 상위 for문은 종료되지만 최고 상위 for문은 종료되지 않는다. 
                     raise StopIteration 
                     # 예외가 try 문 안에 있지 않으면 에러 발생시 프로그램이 멈춘다. 
except StopIteration: 
     print('정상종료')
