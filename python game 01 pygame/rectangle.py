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
FPSCLOCK = pygame.time.Clock()

def main(): # main routine
    
    while True:
        # SURFACE.fill((255,255,255))
        
        for event in pygame.event.get():
            if event.type == QUIT:
                pygame.quit()
                sys.exit()
        
        SURFACE.fill((255,255,255))
        
        # 빨간 직사각형(꽉 채워 칠한다.)
        pygame.draw.rect(SURFACE,(255,0,0),(10,20,100,50))
        # 굵기 3
        pygame.draw.rect(SURFACE,(255,0,0),(150,20,100,45),3)
        # 녹색 직사각형
        pygame.draw.rect(SURFACE,(0,255,0),((100,80),(80,50)))
        # 파란 직사각형 RECT 객체
        RECT0 = Rect(200,65,145,75)
        pygame.draw.rect(SURFACE,(0,0,255),RECT0)
        pygame.display.update()
        FPSCLOCK.tick(10) # 1초에 10번 루프가 실행됨.
            
if __name__ == '__main__':
    main()
        



