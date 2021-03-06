#import 파일명: 해당 파일을 파이썬 인터프린다가 첫 줄부터 파일 끝까지 읽음.
#->print 함수 결과도 출력, 해당 파일에 있는 변수, 함수, 클래스 사용 가능
import a1
#임포트한 파일 내에 함수, 클래스를 쓰려면 파일명, 변수, 함수, 클래스명 입력
print(a1.f)
q = a1.Cal()
print(q)
#
#
#
#
#Run module 한 파이썬 파일은 을 "__main__" 값을 가짐.
#임포트된 파이썬 파일의 변수,


#import 파일명 as 이름: 파일명, 변수, 함수, 클래스가 아닌 이름, 변수, 함수, 클래스로 사용.
#이 파일에서만 쓸 별칭을 설정할 수 있음.
import a1 as A

print(A.f)

#from 파일명 import 추가할 변수, 함수, 클래스명
#: 해당 파일의 특정 변수, 함수, 클래스만 임포트함.
#이 때는 파일명.변수, 함수, 클래스가 아닌 변수, 함수, 클래스명을 그래도 쓸 수 있음
#여러개를 추가할 땐 쉼포 단위로 추가 가능

from a1 import upcal
w = upcal()
print(q)
print(a1.f)    
