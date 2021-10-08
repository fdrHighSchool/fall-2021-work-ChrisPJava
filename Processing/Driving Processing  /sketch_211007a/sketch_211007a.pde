void setup() {
  size(1200,800);
  background(10,175,50);
  rectMode(CENTER);

}

void draw() {
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

  //stop sign
  fill(255,255,255);
  textSize(15);
  fill(250,0,0);
  noStroke();
  rect(742,553,60,20);
  rect(742,553,20,60);
  //triangle();

  //stop text and post
  stroke(0);
  line(742,583,742,650);
  fill(255,255,255);
  text("STOP",724,558);

  //carV1

  //carV2

  //animation

  //controls

}
