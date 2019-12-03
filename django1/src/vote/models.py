from django.db import models

class Question(models.Model):
    
    title = models.CharField('제목::',max_length= 100)
    
    pub_date = models.DateField()
    def __str__(self):
        return self.title
    #모델 클래스에 정의된 변수, 테이블 이름 등을 처리할 때 사용
    class Meta:
        #ordering: 해당 모델 클래스의 객체들을 정렬하는 방식을 지정
        #리스트 형태로 정렬에 사용할 변수 이름을 문자열로 작성
        #변수 이름 앞에 -를 붙이면 내림차순으로 정렬
        ordering=['-pub_date']
# Create your models here.

class Choice (models.Model):
    name = models.CharField('답변항목',max_length=50)
    #default: 객체 생성시 기본값 설정하는 매개변수
    votes=models.IntegerField('투표 수',default=0)
    #Choice모델클래스가 Question모델클래스와 1:n의 관계를 지니며 Question객체가 삭제되면 연결된 Choice 객체도 삭제됨(CASCADE)
    q=models.ForeignKey(Question,on_delete=models.CASCADE)
    def __str__(self):
     return self.name
    #foreignKey: 다른 모델 클래스의 객체와 연결할 수 있는 클래스(foreignKey(연결할 다른 모델 클래스, on_delete=삭제방식))
    #Choice 모델 클래스의 q변수는 연결된 Question객체와 동일함.
    #->Choice 객체.q.title(또는 pub_date, id)변수를 접근할 수 있음.
    #on_delete: 연결된 모델 클래스의 객체가 삭제될 때 어떻게 처리할지 지정하는 변수
    #on_delete = models.PROTECT : 연결된 모델 클래스의 객체가 삭제되지 않도록 막아주는 기능
    #models.CASCADE: 연견된 모델클래스의 각체가 삭제되면 같이 삭제.(글을 삭제하면 글 안의 댓글이 사라짐)
    #models.SET_NULL : 연결된 객체가 삭제되면 아무것도 연결 안 된 상태 유지.
    #models.SET(연결할 객체):연결된 객체가 삭제되면 매개변수로 넣은 객체와 연걸
    #models.SET_DEFAULT:연결된 객체가 삭제되면 기본 설정된 객체와 연결