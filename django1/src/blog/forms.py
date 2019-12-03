'''
Created on 2019. 4. 6.

@author: 405-6
'''

from blog.models import Post
from django import forms
#글쓰기에 사용할 폼클래스 - 모델 폼 클래스 상속
class PostForm(forms.ModelForm):
    #사용자가 첨부파일, 이미지를 업로드할 수 있도록 커스텀 입력양식 생성
    #이미지나 파일을 업로드하지 않아도 글을 쓸 수 있도록 커스텀 입력양식을 사용하는 것을 선택할 수 있도록 설정
    #->required 매개변서룰 False값을 설정
    
    #하나의 파일 업로드 입력 양식에 여러개의 파일을 동시에 업로드할 수 있도록 위젯 설정
    #->ClearableFileInput 위젯 설정
    files = forms.FileField(required=False,widget=forms.ClearableFileInput(attrs={'multiple':True}))
    images = forms.ImageField(required=False,widget=forms.ClearableFileInput(attrs={'multiple':True}))
    class Meta:
        model = Post
        fields = ['category','headline','content']
