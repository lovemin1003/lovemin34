# -*- coding: utf-8 -*-
"""
Created on Wed Jan 29 23:26:07 2020

@author: COM
"""

import sys
import random 
import pygame
from pygame.locals import QUIT

pygame.init()
SURFACE = pygame.display.set_mode((400,300))
FPSCLOCK = pygame.time.Clock()

def main(): # main routine
    
    while True:
        # SURFACE.fill((255,255,255))
        
        for event in pygame.event.get():
            if event.type == QUIT:
                pygame.quit()
                sys.exit()
        
        SURFACE.fill((0,0,0))
        
        # 세로줄
        for xpos in range(0,400,20):
            pygame.draw.line(SURFACE,0xFF00FF,(xpos,0),(xpos,300))
            
        # 가로줄
        for ypos in range(0,400,20):
            pygame.draw.line(SURFACE,0xFFFFFF,(0,ypos),(400,ypos))
            
        pygame.display.update()
        FPSCLOCK.tick(3)

if __name__== '__main__':
    main()
        