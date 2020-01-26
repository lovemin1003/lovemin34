# -*- coding: utf-8 -*-
"""
Created on Sun Jan 19 18:14:51 2020

@author: COM
"""

import turtle

def drawTree(branch,t):
    if branch > 5:
        t.forward(branch)
        print("전진",branch)
        t.right(20)
       
        drawTree(branch-15,t)
        t.left(40)
        
        drawTree(branch-15,t)
        t.right(20)
        t.backward(branch)
        print("후진",branch)
       

def main():
    t= turtle.Turtle()
    window = turtle.Screen()
    t.left(90)
    t.up()
    t.backward(10)
    t.down() # 그린 선을 나타내줌.
    t.color("green")
    drawTree(36 ,t)
    window.exitonclick()

main()    
        