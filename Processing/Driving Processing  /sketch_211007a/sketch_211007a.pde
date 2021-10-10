int x;
int y;
int yint = 700;
int move;
int press;
boolean motion = true;

void setup() {
  size(1200,800);
  rectMode(CENTER);
  
  //background art
  background(10,175,50);//background
  fill(0,0,0);//pavement
  rect(600,400,1200,200);// horizontal rectangle
  rect(600,600,200,600);// vertical rectangle

  //yellow lines
  fill(255,255,50);
  noStroke();
  rect(60,400,60,20);
  rect(180,400,60,20);
  rect(300,400,60,20);
  rect(420,400,60,20);
  rect(540,400,60,20);
  rect(660,400,60,20);
  rect(780,400,60,20);
  rect(900,400,60,20);
  rect(1020,400,60,20);
  rect(1140,400,60,20);

  //white approach line and stop sign
  fill(255,255,255);
  rect(650,513,100,20);
  fill(255,255,255);

  // start stop sign
  fill(255,255,255);
  fill(250,0,0);
  noStroke();
  rect(742,553,60,20);//vertical rect
  rect(742,553,20,60);//horizontal rect
  
  //triangles
  fill(250,0,0);
  triangle(732,523,712,543,732,543);//top left tri
  fill(250,0,0);
  triangle(752,523,772,543,752,543);// top right tri
  fill(250,0,0);
  triangle(752,583,772,563,752,563);// bottom right tri
  fill(250,0,0);
  triangle(732,583,712,563,732,563);// bottom left tri

  //stop text and post
  stroke(0);
  textSize(24);
  line(742,583,742,650);
  fill(255,255,255);
  text("STOP",714,561);
  // end stop sign
  
}

void draw() {
  x = mouseX;
  y = mouseY;
  
  
  if(yint <= 590) {
    motion = false;
    textSize(20);
    text("SIGNAL BEFORE TURNING",750,460);
  }
  
  //reference 
  System.out.println("x is "+ mouseX);
  System.out.println("y is "+ mouseY);
 
}

void keyPressed() {
  move = 1;
  if(motion == true) {
    if(keyCode == 87) {
       yint = yint - move;
       rect(650,yint,60,90);
     }
  }
}
