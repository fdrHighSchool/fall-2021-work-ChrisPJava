void setup() {
  size(1200,800);
  background(10,175,50);
  rectMode(CENTER);
}

void draw() {
  fill(0,0,0);//pavement
  rect(600,400,1200,200);// horizontal rectangle
  rect(600,600,200,600);// vertical rectangle
  
  //yellw lines
  fill(255,255,50);
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
  
}
