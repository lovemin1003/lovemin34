a=input(int())
print(pow(int(a),5))
d=[(b**c)for b in range(1,6) for c in range(1,6)]
for e in d:
 print(d)
 
#클래스: 변수, 함수를 그룹핑할 때 쓰는 구조.
#클래스를 이용하려면 객체를 만들어야 함.
#객체는 독립적이라서 한 객체의 변수 값을 수정해도 다른 객체엔 영향을 주지 않음.
#클래스 정의
'''
class 클래스명:
변수, 함수를 정의

객체 생성
변수 = 클래스명()
'''

class Cookie:
    pass #아무런 코드가 작성되지 않더라도 프로그램이 실행되는 키워드.

q = Cookie()
q.w = 50
w = 100
z = Cookie()
z.w = 55
print(q)
print(z)
print(Cookie)
print(id(Cookie))
print(w,q.w,z.w)

