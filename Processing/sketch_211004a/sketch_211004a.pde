void setup(){
  size(1200,800);
}

void draw(){
  int x = mouseX;
  int y = mouseY;
  stroke(16);
  background(148,216,255);//background color

  line(x-150,y-150,y-150,x-150);//parallel-4
  line(x-200,y-200,y-200,x-200);//parallel-4
  line(x-200,y-200,y-150,x-150);//slant-4

  line(x-100,y-100,y-100,x-100);//parallel-3
  line(x-150,y-150,y-150,x-150);//parallel-3
  line(x-150,y-150,y-100,x-100);//slant-3

  line(x-50,y-50,y-50,x-50);//parallel-2
  line(x-100,y-100,y-100,x-100);//parallel-2
  line(x-100,y-100,y-50,x-50);//slant-2

  line(x,y,y,x);//parallel-1
  line(x-50,y-50,y-50,x-50);//parallel-1
  line(x-50,y-50,y,x);//slant-1

  //main reference lines
  line(x+50,y+50,y+50,x+50);//parallel
  line(x,y,y,x);//parallel
  line(x,y,y+50,x+50);//slant
  //main reference lines

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

  line(x-200,y-200,x+350,y+350);//long line top
  line(y-250,x-250,y+300,x+300);//long line bottom

  line(y+300,x+300,x+350,y+350);//right side right triangle
  line(y-250,x-250,x-200,y-200);//left side right triangle


  System.out.println("x is: "+ x);
  System.out.println("y is: "+ y);

}
