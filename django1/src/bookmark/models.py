from django.db import models


# Create your models here.
class bookmark(models.Model):
    
    name = models.CharField(max_length= 100)
    
    url = models.URLField()
    
#   def __str__(self):
   #     return models.Model.__str__(self)
   
    def __str__(self):
        return self.name
    
    