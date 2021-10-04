void setup(){
  size(600,400);
}

void draw(){
  background(50,100,200);
  int x = mouseX;
  int y = mouseY;
  
  background(148,216,255);
  stroke(16);
 
  line(x+50,y+50,y+50,x+50);//parallel
  line(x,y,y,x);//parallel 
  line(x,y,y+50,x+50);//slant
  
  line(x+100,y+100,y+100,x+100);//parallel2
  line(x+50,y+50,y+50,x+50);//parallel2
  line(x+50,y+50,y+100,x+100);//slant2
  
  line(x+150,y+150,y+150,x+150);//parallel3
  line(x+100,y+100,y+100,x+100);//parallel3
  line(x+100,y+100,y+150,x+150);//slant3
  
  line(x+200,y+200,y+200,x+200);//parallel4
  line(x+150,y+150,y+150,x+150);//parallel4
  line(x+150,y+150,y+200,x+200);//slant4
  
  line(x+250,y+250,y+250,x+250);//parallel5
  line(x+200,y+200,y+200,x+200);//parallel5
  line(x+200,y+200,y+250,x+250);//slant5
  
  line(x+300,y+300,y+300,x+300);//parallel6
  line(x+200,y+200,y+200,x+200);//parallel6
  line(x+250,y+250,y+300,x+300);//slant6

}
