# -*- coding: utf-8 -*-
"""
Created on Sun Dec 15 10:09:48 2019

@author: COM
"""

import turtle

t = turtle.Pen()
"""

t = turtle.Pen()은 t = turtle.turtle()로 해도 됨.

"""

""" 커서 색 조정"""
t.pencolor("#e444a4")
""" 커서 모양을 거북이로 """
t.shape("turtle")
""" 커서를 100픽셀 앞으로"""
t.forward(100)
""" 커서를 200픽셀 뒤로"""
t.back(200)
""" 커서를 300도 우회전"""
t.right(300)
""" 커서를 100픽셀 앞으로"""
t.forward(100)
""" 커서를 200픽셀 뒤로"""
t.back(200)

t.reset()