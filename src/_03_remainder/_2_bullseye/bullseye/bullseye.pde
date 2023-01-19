
void setup() {
 
  // set the size of your sketch
  size(500, 500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 int x = 250;
 int y = 250;
  //Use an if statement and remainder to alternate the color of your rings.
  for(int z = 1; z<8; z++) {
 if (z % 2 == 0) {
   fill(#FF0000);
 }
 else {
   fill(#000000);
 }
 ellipse(250,250,x,y); 
 x=x-31;
 y=y-31;
  }
}
