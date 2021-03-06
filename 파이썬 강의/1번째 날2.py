#사칙연산 클래스 정의
'''
클래스 내부에 함수 정의시 주의점.
클래스 함수는 최소 1개의 매개변수를 요구함.(함수 내부에서 다른 클래스의 함수나
변수를 접근하는데 있어서 매개 변수로 객체 정보를 받지 않으면 문법상으로
처리가 안 되기 때문.
클래스 내에 정의한 함수는 첫번째 인자값으로 함수를 호출한 객체 정보를 넘겨받음.
>>념겨받은 객체정보로 다른 변수, 함수를 함수 내에서 호출할 수 있음.
>>객체정보를 저장하는 변수 이름을 self로 지정하는 것을 권장함.

'''
'''
생성자: 객체생성시 맨 처음 호출되는 함수
객체가 생성되는 순서.
클래스 내에 정의된 함수를 저장할 수 있는 공간 생성->생성된 공간에 함수 복사
->생성자 함수 호출
생성자 함수의 self는 새로 만들어진 객체 정보가 담겨져있음
모든 클래스 내의 생성자 함수 이름은 __??__(언더바 2개씩)로 고정
생성자 함수는 옵션으로 매개변수개수만 설정 가능
return 키워드는 못 씀(객체를 넘겨주는 함수라서)
'''
'''
클래스에 생성자를 정의하지 않는 경우 다음과 같은 생성자가 자동으로 생성됨.
def _??_(self):
 pass
'''
class Cal:

    

    def __init__(self,a=0,b=0): #옵션으로 a,b 변수에 인자값을 넣을 수 있는 방식.
        #변수 생성만
        #self.a = None
        #self.b = None

        #변수 생성 및 초기화
         self.a = a
         self.b = b

        
    def setdata(self, a,b):

       self.a = a
       self.b = b
    ''' 
self:객체 정보
a,b 호출시 넘겨준 인자값
객체 내부의 a,b 변수에 값 저장
   '''
    #더하기 함수
    def add(self):
     return self.a+self.b
    #더하기 함수2
    def add1(self,g):
     print('더하기 함수', self)
     print('객체에 저장된 변수', self.c)
     return g
    #빼기 함수
    def sub(self):
        return self.a-self.b
#곱셈 함수
    def mul(self):
        return self.a*self.b
#나눗셈 함수
    def div(self):
        return self.a/self.b



#객체 생성시, 생성자 함수가 2개의 인자값(a,b)을 요구하므로 반드시 매개변수 개수
#만큼 인자값을 전달해야 함.
f=Cal(2,6)
h=Cal(3,9)

#객체 내부의 값 설정
f.setdata(100,50)
print(f.add())
print(f.sub())
print(f.mul())
print(f.div())

'''
h객체는 setdata함수로 a,b변수를 생성하지 않아서 add함수 호출시 에러가 생김
(사용하려는 변수가 없을 때 생김)
>>생성자 함수를 클래스에 정의해서 사용하는 변수들을 초기화하는 코드작성
'''
#print(h.add())

f.c= 45
print("계산기 객체:",f)
#f.add1(25)
#클래스 정의 안에 있는 함수 호출법
'''
클래스 내부에 있는 함수를 호출할 경우엔 어떤 객체가 함수를 호출하는지 모르므로
첫 인자값을 해당 클래스의 객체정보로 설정해야함.
'''
#Cal.add(f,10)
#print(f.add(3,5) )

#class 클래스명(상속받을 클래스 1,2,3,...):
#Cal 클래스의 기능(변수, 함수)을 물려받은 클래스 정의
class upcal(Cal):
    #클래스 변수: 객체들간의 공용으로 사용되는 변수를 의미
    q=16
    
    #생성자 함수 오버라이딩
    #주의점:상속받은 클래스에서 초기화하는 작업이 유지되야 하므로,
    #생성자 오버리이딩시 super(),__init__()을 호출해야 함.
    #상속받은 클래스의 인자값 형태를 알지 못 한 상태에서
    #원활한 인자값 전달을 위해 *, **로 인자값을 처리.
    def __init__(self, *args, **kwargs):
        #*args:함수 호출시 인자값이 순서대로 저장(튜플)
        #**kwargs:함수 호출시 매개변수=인자값 들어 저장(사전)

        #함수를 호출할 때 *튜블변수: 각 요소값을 매개변수 순서대로 대입
        #함수를 호출할 때 **사전변수: 키 값에 해당하는 매개변수에 값을 대입
        print(args)
        print(kwargs)
        super().__init__(*args, **kwargs)
    
    #상속받은 클래스의 함수 외에 추가적인 함수를 정의해 쓸 수 있음.
    #제곱 함수
    def pow(self):
        return self.a **self.b
#상속받은 클래그의 함수를 수정하려면 동일한 함수 이름으로 함수 재정의(오버라이딩)
#오버라이딩은 매개변수, 코드, 출력의 다입을 모두 바꿀 수 있음.
    def div(self):  
         if self.b==0:
             print('0으로 못 나눔')
             return None
         #상속받은 클래스의 함수를 호출
         #Super(): 해당 클래스가 상속받은 클래스의 함수/변수를 호출할 때 사용
         #div함수가 오버라이딩 되었지만 Super().div()를 하게되면
         #Cal 클래스에 정의된 div함수가 호출
         return super().div()
         #return self.a/self.b 부모 클래스에 있어서 굳이 안 적어도 됨.

        #해당 파일 실행시만 아래코드가 실행되도록 설정


        
print('-----------------------상속받을 클래스 객체 생성-------------')
f=upcal(4,2)
f=upcal(a=6,b=8)
print(f)
f.setdata(50,10)
print('클래스 변수 출력')
print(upcal.q)
print(f.q)
print(f)
upcal.q=60
print('바뀐 값:',f.q)
#Cal 클래스에 이미 add, sub함수가 정의되었기 때문에
#upcal객체가 해당 함수들을 쓸 수 있음.
print(f.add())
print(f.sub())
print(f.div())
f.setdata(5,10)
print('신기능',f.pow())

