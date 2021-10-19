int t1 = 700;
int t2 = 675;
int t3 = 710;
int t4 = 720;
int move;
boolean motion = true;
boolean turn = false;

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
  textSize(23);
  line(742,583,742,650);
  fill(255,255,255);
  text("STOP",713,560);
  // end stop sign
  
}

void draw() { 
  
  if(t1 <= 570) {
    motion = false;
    textSize(40);
    stroke(0);
    delay(500);
    for(int i = 0;i<=5;i++) {
      fill(255,255,0);
      rect(680,t3,20,10);
      delay(50);
      fill(255,0,0);
      rect(680,t3,20,10);
      delay(500);
    }
}

  /* reference for numbers
  System.out.println("x is "+ mouseX);
  System.out.println("y is "+ mouseY);
  System.out.println(t1);
  System.out.println(t2);
  System.out.println(t3);
  System.out.println(t4);
  System.out.println(keyCode);
  */
}

//user control w key and d key
void keyPressed() {
  move = 1;
  if(motion == true) {
    if(keyCode == 87) {
      t1 = t1 - move;
      System.out.print(t1);
      fill(0,10,100);
      stroke(0);
      rect(650,t1,80,30);
      noStroke();
      t2 = t2 - move;
      rect(650,t2,50,20);
      fill(0,200,200);
      rect(650,t2,35,10);
      fill(200,0,0);
      stroke(0);
      //blinkers
      t3 = t3 - move;
      rect(620,t3,20,10);
      rect(680,t3,20,10);
      
      //wheels
      fill(30,30,30);
      t4 = t4 - move;
      rect(625,t4,20,10);
      rect(675,t4,20,10);
      noStroke();
    }
  }

  if(turn == true) {
    if(keyCode == 68) {
      
     }
   }
}
