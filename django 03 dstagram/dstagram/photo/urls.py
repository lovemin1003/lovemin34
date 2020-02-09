from django.urls import path
from django.views.generic.detail import DetailView

from .views import *
from .models import photo

app_name = 'photo'

urlpatterns = \
[
    path('',photo_list,name='photo_list'),
    path('detail/<int:pk>/',DetailView.as_view(model=photo,template_name='photo/detail.html'),name='photo_detail'),
    path('upload/',photouploadview.as_view(),name='photo_upload'),
    path('delete/<int:pk>/', photodeleteview.as_view(), name='photo_delete'),
    path('update/<int:pk>/', photoupdateview.as_view(), name='photo_update'),
]