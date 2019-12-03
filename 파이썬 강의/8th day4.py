# -*- coding: utf-8 -*-
"""
Created on Sun Mar 10 12:16:45 2019

@author: 5
"""
'''
문자열 형식으로 입력받은 모스 부호(dot: . dash:-)를 해독하여 영어 문장으로 출력하는 프로그램을 작성해 보자.

글자와 글자 사이는 공백 하나, 단어와 단어 사이는 공백 두개로 구분한다.
예를 들어 다음 모스부호는 "HE SLEEPS EARLY"로 해석해야 한다.
.... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--
  h  e   s   l   e e   p   s   e  a  r   l    y

'''
'''
모스부호 규칙 표


A .- N -. 
B -... O --- 
C -.-. P .--. 
D -.. Q --.- 
E . R .-. 
F ..-. S ... 
G --. T - 
H .... U ..- 
I .. V ...- 
J .--- W .-- 
K -.- X -..- 
L .-.. Y -.-- 
M -- Z --.. 
'''
def cord():
    a= input()
    
    listb=list(a)
    
    c=''
    
    
    for d in range(0,len(listb)):
        if listb[d]=='A' or listb[d]=='a':
           c += '.-'
        elif listb[d]=='B'or listb[d]=='b':
           c += '-...'
        elif listb[d]=='C'or listb[d]=='c':
           c += '-.-.'
        elif listb[d]=='D'or listb[d]=='d':
           c += '-..'
        elif listb[d]=='E'or listb[d]=='e':
           c += '.'  
        elif listb[d]=='F'or listb[d]=='f':
           c += '..-.'
        elif listb[d]=='G'or listb[d]=='g':
           c += '--.'
        elif listb[d]=='H'or listb[d]=='h':
           c += '....'
        elif listb[d]=='I'or listb[d]=='i':
           c += '..'
        elif listb[d]=='J'or listb[d]=='j':
           c += '.---'
        elif listb[d]=='K'or listb[d]=='k':
           c += '-.-'
        elif listb[d]=='L'or listb[d]=='l':
           c += '.-..'
        elif listb[d]=='M'or listb[d]=='m':
           c += '--'
        elif listb[d]=='N'or listb[d]=='n':
           c += '-.'
        elif listb[d]=='O'or listb[d]=='o':
           c += '---'
        elif listb[d]=='P'or listb[d]=='p':
           c += '.--.'
        elif listb[d]=='Q'or listb[d]=='q':
           c += '--.-'
        elif listb[d]=='R'or listb[d]=='r':
           c += '.-.'
        elif listb[d]=='S'or listb[d]=='s':
           c += '...'
        elif listb[d]=='T'or listb[d]=='t':
           c += '-'
        elif listb[d]=='U'or listb[d]=='u':
           c += '..-'
        elif listb[d]=='V'or listb[d]=='v':
           c += '...-'
        elif listb[d]=='W'or listb[d]=='w':
           c += '.--'
        elif listb[d]=='X'or listb[d]=='x':
           c += '-..-'   
        elif listb[d]=='Y'or listb[d]=='y':
           c += '-.--'   
        elif listb[d]=='Z'or listb[d]=='z':
           c += '--..'  
        elif listb[d]==' ':
           c += ' '      
           
    return c

print(cord())    



#답안

dic = {
    '.-':'A','-...':'B','-.-.':'C','-..':'D','.':'E','..-.':'F',
    '--.':'G','....':'H','..':'I','.---':'J','-.-':'K','.-..':'L',
    '--':'M','-.':'N','---':'O','.--.':'P','--.-':'Q','.-.':'R',
    '...':'S','-':'T','..-':'U','...-':'V','.--':'W','-..-':'X',
    '-.--':'Y','--..':'Z'
}

def morse(src):
    result = []
    for word in src.split("  "):
        for char in word.split(" "):
            result.append(dic[char])
        result.append(" ")
    return "".join(result)
   
        
        
        