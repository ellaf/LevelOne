void setup(){
  
size(500,500);
  
background(221, 255, 255);
  
}
void draw(){
  

  
   float frequency = 20;

  for(int i = 0; i < 49; i++){
  fill(mouseX+100, mouseY+20, mouseY+50);
    ellipse(getWormX(600),getWormY(600),40,40);

  }
  
  makeMagical();
  
  if(mouseButton == RIGHT){
     for(int i = 0; i < 49; i++){
  fill(i*2, i*2, i*9);
    ellipse(getWormX(600),getWormY(600),40,40);
  }
  }
  
}

float frequency = .001;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}

  
  
  
  
  
  

