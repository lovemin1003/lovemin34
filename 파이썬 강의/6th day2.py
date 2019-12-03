# -*- coding: utf-8 -*-
"""
Created on Sun Mar  3 09:59:39 2019

@author: 5
"""
'''
여러 역 이름이 들어가있는데 이 중 2호선 역만 뽑고자 한다면 
#,@,&,! 안에 넣어야 할 것은?

e = '{"종로3가역":(1,3,5),"신촌역":(2),"연신내역":(3,6)}'
import ast
e_dict = ast.literal_eval(e)
f_save =[]
for key, value in e_dict.items():
    f_save.@@@([&&&,!!!])


'''

e = '{"종로3가역":(1,3,5),"신촌역":(2,),"연신내역":(3,6)}'
import ast
e_dict = ast.literal_eval(e)
f_save =[]
for key, value in e_dict.items():
    if 2 in value:#2가 value 안에 있다면
        f_save.append([key,value])
    
print(f_save[0:])
print(f_save)

print('='*90)









      
      
      

'''
word = 'Deleveled'
if list(word.lower())[@@@] == list(word.lower()):
    return: True
else:
    return: False
    
회문을 판별하기 위해 @@@ 안에 넣어야 하는 것은?
(회문:똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장) 
palindrome=회문을 판별하는 함수   
'''



   


def is_palindrome(word):

 if list(word.lower())[::-1] == list(word.lower()):
    print('회문임.')
 else:
    print('회문 아님.')

print(is_palindrome('Deleveled'))  
print(is_palindrome('serena'))    

#list(word.lower) >> list('deleveled')
#list('deleveled') >>
#['d','e','l','e','v','e','l','e','d']

