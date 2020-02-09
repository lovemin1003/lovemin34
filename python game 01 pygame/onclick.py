# -*- coding: utf-8 -*-
"""
Created on Thu Jan 30 20:32:10 2020

@author: COM
"""

import sys
import pygame
from pygame.locals import QUIT, MOUSEBUTTONDOWN

pygame.init()
SURFACE = pygame.display.set_mode((400,300))
FPSCLOCK = pygame.time.Clock()

def main(): # main routine
    mousepos = []
    while True:
        SURFACE.fill((225,225,225))
        
        for event in pygame.event.get():
            if event.type == QUIT:
                pygame.quit()
                sys.exit()
            elif event.type == MOUSEBUTTONDOWN:
                mousepos.append(event.pos)
                
        for pos in mousepos:
            pygame.draw.circle(SURFACE, (0,255,0),pos, 5)
        
        
        pygame.display.update()
        FPSCLOCK.tick(10)

if __name__== '__main__':
    main()