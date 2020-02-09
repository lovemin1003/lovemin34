# -*- coding: utf-8 -*-
"""
Created on Wed Jan 29 20:18:46 2020

@author: COM
"""

import sys
import pygame
from pygame.locals import * # QUIT

pygame.init()
SURFACE = pygame.display.set_mode((400,300))
pygame.display.set_caption("pygame")

def main(): # main routine
    while True:
        SURFACE.fill((255,255,255))
        
        for event in pygame.event.get():
            if event.type == QUIT:
                pygame.quit()
                sys.exit()
        
        pygame.display.update()
            
if __name__ == '__main__':
    main()
        



