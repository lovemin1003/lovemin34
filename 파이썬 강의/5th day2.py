# -*- coding: utf-8 -*-
"""
Created on Sat Mar  2 12:39:27 2019

@author: 5
"""
#for문 과제 3가지
for a in range(1,101):
    print(a)
    
print('@'*90)
    
b={111,231,2213,62,763,124}
f = len(b)#길이 측정법
count=0
d=0
for c in b:
      count+=1
      d+=c
      
print(d/count)  
print(d/f) 

print('@'*90)

e = [f*2 for f in range(1,6) if f%2==1]   

print(e) 

'''
다음 중 파렐에 잠입한 스파이의 이름을 찾으시오.
(스파이는 이름을 다르게 입력함.)


'''

name = ['sonata','kanon','serena','fina','caro']

check = ['sonata','canon','serena','flna','caro']

g = len(name)
answer=[]


for i in range (0,g):
        
            if name[i] == check[i]:
                pass
            else:
                answer.append(name[i])
                
print(answer)    

'''
조건문과 반복문을 이용해서 {'ani':[]}에 
애니제목('컬러풀 파스토랄레', '원피스','듀얼 마스터즈'을 넣어
원하는 결과를 만들어보시오.
(딕셔너리에 값을 넣는 법)

'''    


#1번째 방법
aa = ['컬러풀 파스토랄레', '원피스','듀얼 마스터즈']
ani = {'movie':[]}

for l in  aa:
    ani['movie'].append(l)
    print(ani)
    
print('@'*90)    
                
#2번째 방법
aa = ['컬러풀 파스토랄레', '원피스','듀얼 마스터즈']
ani = {'movie':[]}
z=[]

for l in  aa:
    ani['movie']=ani.get('movie')+[l]
    print(ani)
               
                















