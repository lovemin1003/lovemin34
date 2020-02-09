# -*- coding: utf-8 -*-
"""
Created on Thu Jan 30 21:37:39 2020

@author: COM
"""

import sys 
import math
import random
import pygame
from pygame.locals import QUIT, KEYDOWN, K_LEFT, K_RIGHT, Rect

class Block: # 블록, 공, 패들 객체
    def __init__(self,col,rect, speed=0):
        self.col = col
        self.rect = rect
        self.speed = speed
        self.dir = random.randint(-45, 45) + 270
        
    def move(self): # 공 이동
        self.rect.centerx += math.cos(math.radians(self.dir))\
            * self.speed
        self.rect.centery -= math.sin(math.radians(self.dir))\
            * self.speed
    
    def draw(self): # 블록, 공, 패들을 그린다.
        if self.speed == 0:
            pygame.draw.rect(SURFACE, self.col, self.rect)
        else:
            pygame.draw.ellipse(SURFACE, self.col, self.rect)
            

def tick(): # 프레임별 처리
    global BLOCKS
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()
        elif event.type == KEYDOWN:
            if event.key ==K_LEFT and PADDLE.rect.centerx >= 0: 
                # and PADDLE.rect.centerx >=0: 화면 밖으로 패들이 안 넘어가도록 설정했음.
                PADDLE.rect.centerx -= 10
            elif event.key == K_RIGHT and PADDLE.rect.centerx <= 600:
                # and PADDLE.rect.centerx <=600: 화면 밖으로 패들이 안 넘어가도록 설정했음.
                PADDLE.rect.centerx += 10
    if BALL.rect.centery < 1000:
        BALL.move()
        
    # 블록과 충돌?
    prevlen = len(BLOCKS)
    BLOCKS = [x for x in BLOCKS if not x.rect.colliderect(BALL.rect)]
    if len(BLOCKS) != prevlen:
        BALL.dir *= -1
        
    if PADDLE.rect.colliderect(BALL.rect):
        BALL.dir = 90 + (PADDLE.rect.centerx - BALL.rect.centerx) / PADDLE.rect.width * 80
             
    # 벽과 충돌?
    if BALL.rect.centerx < 0 or BALL.rect.centerx > 600:
        BALL.dir = 180 - BALL.dir
    if BALL.rect.centery < 0:
        BALL.dir = -BALL.dir
        BALL.speed = 15
        
pygame.init()
pygame.key.set_repeat(5, 5)
SURFACE = pygame.display.set_mode((600, 800))
FPSCLOCK = pygame.time.Clock()
BLOCKS = []
PADDLE = Block((100, 132, 123), Rect(300, 700, 100, 30))
BALL = Block((122, 231, 211), Rect(300, 400, 20, 20), 10)

def main(): # 메인 루틴
    myfont = pygame.font.SysFont(None, 80)
    mess_clear = myfont.render("clear!", True, (255, 255, 0))
    mess_over = myfont.render("GAME OVER!", True, (255, 255, 0))
    fps = 30
    colors = [(255, 0, 0), (255, 100, 100), (123, 142, 115), 
              (0, 0, 255), (100, 100, 200), (0, 255, 111)]
    
    for ypos, color in enumerate(colors, start=0):
        for xpos in range(0, 5):
            BLOCKS.append(Block(color, Rect(xpos * 100 + 60, ypos * 50 + 40, 80, 30)))
    
    while True:
        tick()
        
        SURFACE.fill((0,0,0))
        BALL.draw()
        PADDLE.draw()
        for block in BLOCKS:
            block.draw()
        
        if len(BLOCKS) == 0:
            SURFACE.blit(mess_clear,(200,400))
        if BALL.rect.centery > 800 and len(BLOCKS) > 0:
            SURFACE.blit(mess_over, (150,400))
        
        pygame.display.update()
        FPSCLOCK.tick(fps)

if __name__ == '__main__':
    main()
        
        
       
         

            