# -*- coding: utf-8 -*-
"""
Created on Thu Jan 30 19:47:17 2020

@author: COM
"""

import sys
import pygame
from pygame.locals import QUIT

pygame.init()
SURFACE = pygame.display.set_mode((400,300))
FPSCLOCK = pygame.time.Clock()

def main(): # main routine
    logo = pygame.image.load("토야마카스미.png")
    while True:
        for event in pygame.event.get():
            if event.type == QUIT:
                pygame.quit()
                sys.exit()
        
        SURFACE.fill((225,225,225))
        
        # 왼쪽 위의 (20,50) 위치에 로고를 그린다.
        SURFACE.blit(logo,(20,50))
        
        pygame.display.update()
        FPSCLOCK.tick(30)

if __name__== '__main__':
    main()
        