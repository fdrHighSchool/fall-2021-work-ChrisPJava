void setup(){
  size(600,400);
  background(200);
}

void draw(){
  int x = mouseX;
  int y = mouseY;
  
  background(200);
  stroke(16);
  line(x+50,y+50,50,x+50);
  line(x-100,y-600,50,x+200);
  line(x+100,y-100,550,x-100);
  line(x+10,y+50,250,x-70);
  line(x+50,y-10,200,x+90);
}
