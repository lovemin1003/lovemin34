from django.shortcuts import render, redirect
from .models import photo
from django.views.generic.edit import CreateView, DeleteView, UpdateView

def photo_list(request):
    photos = photo.objects.all()
    return render(request,'photo/list.html',{'photos':photos})

class photouploadview(CreateView):
    model = photo
    fields = ['photo','text']
    template_name = 'photo/upload.html'

    def form_valid(self, form):
        form.instance.author_id = self.request.user.id
        if form.is_valid():
            form.instance.save()
            return redirect('/')
        else:
            return self.render_to_response({'form':form})

class photodeleteview(DeleteView):
    model = photo
    success_url = '/'
    template_name = 'photo/delete.html'

class photoupdateview(UpdateView):
    model = photo
    fields = ['photo','text']
    template_name = 'photo/update.html'

