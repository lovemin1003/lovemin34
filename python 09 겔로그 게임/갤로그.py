# -*- coding: utf-8 -*-
"""
Created on Sun Jan 26 20:41:08 2020

@author: COM
"""

# -*- coding: utf-8 -*-
"""
Created on Sun Jan 26 16:42:52 2020

@author: COM
"""

from tkinter import *
import time

# 게임 스프라이트를 나타내는 클래스로 공통적으로 사용되는 변수와 메소드를 가지고 있음.
class Sprite:
    # 생성자
    def __init__(self,image,x,y):
        self.img = image # 스프라이트가 가진 이미지
        self.x = x # 현재 위치의 x좌표
        self.y = y # 현재 위치의 y좌표
        self.dx = 0 # 단위시간에 움직이는 x방향 거리
        self.dy = 0 # 단위시간에 움직이는 y방향 거리
        
    # 스프라이트의 가로 길이 반환
    def getwidth(self):
        return self.img.width()
        
    # 스프라이트의 세로 길이 반환
    def getheight(self):
        return self.img.height()
        
    # 스프라이트를 화면에 그리기
    def draw(self,g):
        g.create_image(self.x, self.y, anchor=NW, image = self.img)
        
    # 스프라이트를 움직이는 메소드
    def move(self):
        self.x += self.dx
        self.y += self.dy
        
    # dx를 설정하는 설정자 메소드
    def setdx(self,dx):
        self.dx = dx
        
    # dy를 설정하는 설정자 메소드
    def setdy(self,dy):
        self.dy = dy
        
    # dx를 반환하는 접근자 메소드
    def getdx(self):
        return self.dx
        
    # dy를 반환하는 접근자 메소드
    def getdy(self):
        return self.dy
        
    # x를 반환하는 접근자 메소드
    def getx(self):
        return self.x
        
    # y를 반환하는 접근자 메소드
    def gety(self):
        return self.y
        
    # 다른 스프라이트와의 충돌 여부를 계산한다. 충돌시 true를 반환한다.
    def checkcollision(self,other):
        p1x = self.x
        p1y = self.y
        p2x = self.x+self.getwidth()
        p2y = self.y+self.getheight()
        p3x = other.x
        p3y = other.y
        p4x = other.x+other.getwidth()
        p4y = other.y+other.getheight()
            
        # 겹치지 않는 조건을 계산하고 결과에 not를 적용한다.
        overlapped = not(p4x < p2x or p3x > p2x or p2y < p3y or p1y > p4y)
        return overlapped
            
    # 충돌을 처리한다. 현재는 아무 일도 일어나지 않음, 자식 클래스에서 오버라이드됨.
    def handlecollision(self,other):
        pass
        
        
# 주인공을 나타내는 클래스
class starshipsprite(Sprite):
    def __init__(self,game, image,x,y):
        super().__init__(image,x,y)
        self.game = game
        self.dx = 0
        self.dy = 0
    # 주인공을 움직인다. 만약 윈도우의 경계를 넘으려고 할 경우 움직이지 않음.
    def move(self):
        if((self.dx < 0) and (self.x < 10)):
            return
            
        if((self.dx > 0) and (self.x > 800)):
            return
            
        super().move()
        self.dx = 0
            
    # 충돌을 처리한다. 적과 주인공이 부딪히면 게임 오버됨.
    def handlecollision(self,other):
        if type(other) is aliensprite:
            self.game.endgame()
            
                
        
        
# 적을 나타내는 클래스
class aliensprite(Sprite):
    def __init__(self,game, image,x,y):
        super().__init__(image,x,y)
        self.game = game
        self.dx = -10 # x 방향으로만 움직임.
                
    # 적을 움직이는 메소드 윈도우 경계에 도달시 한칸 아래로 이동함.
    def move(self):
        if(((self.dx <0) and (self.x<10)) or ((self.dx > 0) and (self.x > 750))):
            self.dx = -self.dx
            self.y += 50

                
            if (self.y > 600): # 적이 주인공을 잡게되는 경우엔 게임 오버.
                game.endgame()


            
        super().move()     
        
# 포탄을 나타내는 클래스

class shotsprite(Sprite):

    def __init__(self,game, image,x,y):
        super().__init__(image,x,y)
        self.game = game
        self.dy = -20


    # 화면을 벗어나면 객체를 리스트에서 삭제한다.
    def move(self):
        super().move()

        if(self.y < -100):
            self.game.removesprite(self)

    # 충돌을 처리한다. 미사일과 적을 모두 리스트에서 삭제한다.

    def handlecollision(self,other):
        if type(other) is aliensprite:
            self.game.removesprite(self)
            self.game.removesprite(other)











# 게임을 나타내는 클래스
class galagagame():

    # 왼쪽 화살표 키 이벤트 처리 함수
    def keyleft(self,event):
        self.starship.setdx(-10)
        return

    # 오른쪽 화살표 키 이벤트 처리 함수
    def keyright(self,event):
        self.starship.setdx(+10)
        return

    # 스페이스키(발사) 이벤트 처리 함수
    def keyspace(self,event):
        self.fire()
        return

    # 게임에 필요한 스프라이트를 생성하는 메소드
    def initSprites(self):
        self.starship = starshipsprite(self,self.shipimage,370,550)
        self.sprites.append(self.starship)

        for y in range(0,3):
            for x in range(0,15):
                alien = aliensprite(self, self.alienimage, 100+(x*50), (50) + y * 30)
                self.sprites.append(alien)

    # 생성자 메소드
    def __init__(self,master):
        self.master = master
        self.sprites = []
        self.canvas = Canvas(master, width=800, height=600)
        self.canvas.pack()
        self.shotimage = PhotoImage(file="야마부키사아야.png")
        self.shipimage = PhotoImage(file="이치가야아리사.png")
        self.alienimage = PhotoImage(file="토야마카스미.png")
        self.running = True
        self.initSprites()
        master.bind("<Left>", self.keyleft)
        master.bind("<Right>", self.keyright)
        master.bind("<space>", self.keyspace)


    # 게임을 시작하는 메소드
    def startgame(self):
        self.sprites.clear()
        initSprites()

    # 게임을 종료하는 메소드
    def endgame(self):
        self.running = False
        pass

    # 스프라이트를 리스트에서 삭제
    def removesprite(self,sprite):
        if(sprite in self.sprites):
            self.sprites.remove(sprite)
            del sprite
            
    
    # 포탄 발사 메소드
    def fire(self):
        shot = shotsprite(self, self.shotimage, self.starship.getx() + 10, self.starship.gety() - 30)
        self.sprites.append(shot)
    
    # 화면 그리기 메소드
    def paint(self, g):
        self.canvas.delete(ALL) # 캔버스의 그리기 객체를 전부 삭제한다.
        self.canvas.create_rectangle(0, 0, 800, 600, fill="black")
        for sprite in self.sprites:
            sprite.draw(self.canvas)
    
    # 게임 루프
    def gameloop(self):
        for sprite in self.sprites:
            sprite.move()
            
        # 스프라이트 리스트 내 객체끼리의 충돌을 검사    
        for me in self.sprites:
            for other in self.sprites:
                if me != other:
                    if(me.checkcollision(other)): 
                        me.handlecollision(other)
                        other.handlecollision(me)
        
        self.paint(self.canvas)
        
        if(self.running):
            self.master.after(10, self.gameloop)
            
                
    
          
    
# Tk()를 호출하여 루트 윈도우를 생성해주면 됨.
root = Tk()
g = galagagame(root)
root.after(10, g.gameloop())
root.mainloop()      
            
                    
            
        
                       

          
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        