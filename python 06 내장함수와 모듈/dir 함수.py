# -*- coding: utf-8 -*-
"""
Created on Sun Jan  5 21:32:41 2020

@author: COM
"""
# 객체가 지닌 변수나 함수를 보여준다 어떤 객체에서 쓸 수 있는 함수인지 알 수 있음.
print(dir([1,2,3]))

# 함수에 대한 설명을 출력할 땐 help()를 호출한다.

#append() 함수의 도움말을 출력하려면 아래와 같이 해준다.
print(help([1,2,3].append))

#clear()
print(help([1,2,3].clear))