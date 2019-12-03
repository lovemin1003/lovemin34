from django.contrib import admin
from blog.models import *
# Register your models here.
admin.site.register(Category)
admin.site.register(Post)
admin.site.register(PostFile)
admin.site.register(PostImage)