from django.shortcuts import render
from bookmark.models import bookmark



# Create your views here.
def index(request):
    return render(request, 'bookmark/main.html',
                  {'a':50, 'b':[1,2,3,4]})

from bookmark.models import bookmark
    
def book_list(request):
    
    objs = bookmark.objects.all()
    print('데이터베이스에 저장된 객체들',objs)
    return render(request, 'bookmark/book_list.html',
                  {'list':objs})
    
def book_one(request, book_idx):
    obj = bookmark.objects.get(id=book_idx)
    return render(request, 'bookmark/book_one.html',
                  {'a':obj})