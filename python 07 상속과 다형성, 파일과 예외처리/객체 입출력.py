# -*- coding: utf-8 -*-
"""
Created on Tue Jan 14 23:30:25 2020

@author: COM
"""

import pickle

my = {"헐크 vs 타노스":1.2, "우리 vs 타노스":8.8}

pickle.dump(my, open("save.p","wb"))
my = pickle.load(open("save.p","rb"))
print(my)
