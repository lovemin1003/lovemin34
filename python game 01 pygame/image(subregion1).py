# -*- coding: utf-8 -*-
"""
Created on Thu Jan 30 20:01:35 2020

@author: COM
"""
# blit 인수에 영역을 지정해서 원래 이미지의 일부만을 그릴 수도 있습니다.
import sys
import pygame
from pygame.locals import QUIT, Rect

pygame.init()
SURFACE = pygame.display.set_mode((400,200))
FPSCLOCK = pygame.time.Clock()

def main(): # main routine
    logo = pygame.image.load("토야마카스미.png")
    while True:
        for event in pygame.event.get():
            if event.type == QUIT:
                pygame.quit()
                sys.exit()
        
        SURFACE.fill((225,225,225))
        SURFACE.blit(logo,(0,0))
        
        SURFACE.blit(logo,(250,50), Rect(50,50,100,100))
        
        pygame.display.update()
        FPSCLOCK.tick(30)

if __name__== '__main__':
    main()