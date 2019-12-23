# -*- coding: utf-8 -*-
"""
Created on Sat Dec 21 12:04:36 2019

@author: COM
"""

pokemon={'우리':'염버니','호브':'흥나숭','단델':'파이리','승재':'울머기'}

print(pokemon)

print(pokemon['우리'])
print(pokemon.get('단델'))

poke=pokemon.get('마리','모르페코')
print(poke)
"항목 추가시"
pokemon['마리']='모르페코'
print(pokemon)

"항목 제거시"
pokemon.pop('마리')
print(pokemon)
del pokemon['단델']
print(pokemon)

"""항목 순회"""

for i in pokemon:
    print(i)

for i in pokemon.items():
    print(i)    
    
"""딕셔너리 키 정렬"""    
print(list(pokemon))
d=sorted(pokemon)
print(d)
"""딕셔너리 값 정렬"""    
print(list(pokemon.values()))
e=sorted(pokemon.values())
print(e)
"""딕셔너리 키 정렬에 맞춰 값을 출력."""
c=list(pokemon.items())
c.sort()
print(c)    
    

"""딕셔너리 값 정렬에 맞춰 키를 출력."""   
f=sorted(pokemon,key=pokemon.__getitem__)
print(f)
