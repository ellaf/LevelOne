int yPosition = 500;
int xPosition = 500;
int birdWidth = 50;
int birdHeight = 50;
int birdYVelocity = 0;
int gravity = 1;
int pipeXPosition = 1000;
float topPipeHeight = random(50-900);


void setup(){
  
size(1000,1000);
  
}
void draw(){
  
  background(68, 221, 238);
  fill(68, 238, 136);
  ellipse(xPosition, yPosition += birdYVelocity += gravity, birdWidth, birdHeight);



  fill(00, 102, 51);
  rect(pipeXPosition--, topPipeHeight, 200, 900);
  rect(pipeXPosition--, topPipeHeight + 1100, 200, 900);

  
if(pipeXPosition == 0){
  pipeXPosition = pipeXPosition += 1000;
  topPipeHeight = random(100-500);

}

if (intersects(xPosition, yPosition, pipeXPosition, topPipeHeight + 1100, 200) == true){
  
  System.exit(0);
  
}
  
}
void mousePressed() {
  
  birdYVelocity =- 15;
  
  
}
boolean intersects(int birdX, int birdY, int paddleX, float paddleY, int paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}

