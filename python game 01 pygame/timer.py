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
    sysfont = pygame.font.SysFont(None, 36)
    counter = 0
    while True:
        # SURFACE.fill((255,255,255))
        
        for event in pygame.event.get():
            if event.type == QUIT:
                pygame.quit()
                sys.exit()
        
        counter += 1        
        SURFACE.fill((0,0,0))
        count_image = sysfont.render("count is {}".format(counter),True,(225,255,255))
        SURFACE.blit(count_image,(50,50))
        pygame.display.update()
        FPSCLOCK.tick(10) # 1초에 10번 루프가 실행됨.
            
if __name__ == '__main__':
    main()
        



