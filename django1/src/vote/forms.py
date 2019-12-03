'''
Created on 2019. 3. 30.

@author: 405-6
'''
from django.forms.models import ModelForm

'''
form: html의 form 태그로 사용자가 웹서버에 전달할 값들을 작성할 수 있는 공간을 생성해줌.
form 태그 안에 input 태그를 작성해서 어떤 입력을 할 수 있는지 지정할 수 있음.
form 태그의 송성으로 action과 method를 지정해야 함.
action: 사용자의 입력을 웹서버의 어느 url로 보낼 것인지 지징.
method: get 또는 post 방식을 지정.

장고의 form: html의 form태그에 들어가는 input태그들을 관리할 수 있는 클래스/기능
모델 클래스에 정의된 변수에 맞춰 input을 자동생성하거나 커스텀 입력 공간에도 생성할 수 있음.
'''

from django.forms.models import ModelForm
from vote.models import Question, Choice
'''
ModelForm: 모델 클래스를 기반으로 입력양식을 자동 생성할 때 상속받는 클래스.
Form: 커스텀 입력양식을 생성할때 상속받는 클래스.
기존의 기능 개발 순서
Model 클래스 정의 ->뷰 함수/클래스 정의 ->html 코드 작성 -> url Conf 등록

변경
Model 클래스 정의 ->form클래스 정의 ->뷰 함수/클래스 정의 ->html 코드 작성 -> url Conf 등록


'''
class QuestionForm(ModelForm):
    class Meta:
        model = Question #이 모델폼 클래스가 Question모델 클래스와 연동
        fields = ['title']#Question 모델 클래스의 변수 중 title 변수만 작성 가능.
        #Meta클래스: 연동하려는 모델 클래스에 대한 정보를 정의하는 클래스(대문자 주의)
        #model, fields, exclude - 변수이름 주의
        #model: 연동하고자 하는 모델 클래스를 지정하는 변수
        #fields: 모델 클래스에 정의된 변수 중 어떤 변수를 클라이언트가 작성할 수 있는지 지정하는 변수
        #(iterable, list형태로 변수명을 문자열로 저장함.)
        #exclude: 모델 클래스에 정의된 변수 중 입력양식으로 만들지 않을 변수들을 지정하는 변수
        #fields나 exclude 중 하나만 사용.
'''
Question, Choice 모델 클래스와 연동된 모델폼 클래스 정의.
Question, Choice 객체 추가, 수정때 사용.
'''

class ChoiceForm(ModelForm):
    def __init__(self,*args,**kargs):
        super().__init__(*args,**kargs)
        print(self.fields)
        self.fields['q'].label = '설문조4'
    class Meta:
        model = Choice
        Fields = ['q','name']
        exclude =['vote']
        







