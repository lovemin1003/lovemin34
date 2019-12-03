"""django1 URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/2.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path,include

from bookmark.views import index,book_list,book_one

urlpatterns = [
    path('admin/', admin.site.urls),
    path('',index,name='main'),
    path('list/', book_list),
    path('<int:book_idx>/', book_one),
    path('vote/', include('vote.urls')),
    #127.0.0.1:8000/cl로 시작하는 url들을 customlogin 폴더의 urls.py에서 처리하도록 등록
    path('cl/',include('customlogin.urls')),
    #social_django 어플리케이션의 하위 URLConf 들록
    #우리가 만든 어플리케이션이 아니므로 app_name변수에 어떤 값이 있는지 확인이 어려움
    #include함수의 namespace매개변수: app_name변수를 무시하고 하위 그룹의 이름을 지정할 수 있음.
    path('auth/',include('social_django.urls',namespace= 'social')),
    path('blog/',include('blog.urls'))
    
    
]

#사용자가 이미지, 첨부파일 요청했을 때,
#웹서버 컴퓨터에 저장된 파일을 클라이언트에게 전달하도록 설정
#웹서버의 로컬 하드디스크와 URL주소를 연동

#setting.py 변수값을 사용할 수 있도록 임포트
from django.conf import settings
#MEDIA_URL과 MEDIA_ROOT를 연결하기 위한 함수 임포트
from django.conf.urls.static import static

urlpatterns += static(settings.MEDIA_URL, document_root = settings.MEDIA_ROOT)
