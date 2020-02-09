from django.contrib import admin
from .models import photo

class photoadmin(admin.ModelAdmin):
    list_display = ['id','author','created','updated']
    raw_id_fields = ['author']
    list_filter = ['created','updated','author']
    search_fields = ['text','created']
    ordering = ['-updated','-created']

admin.site.register(photo,photoadmin)

# Register your models here.
