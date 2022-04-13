import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {


  PImage imgBluePaddle;
  
  float fltCirSpeedX = 1;
  float fltCirSpeedY = 1;

  float fltCircleX = 200;
  float fltCircleY = 200;

  float fltPaddleX = 200;
  float fltPaddleY = 100;

  float fltPaddleSpeedX = 5;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);

  }
  
  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    imgBluePaddle = loadImage("paddleBlu.png");

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    background(32);

    ellipse(fltCircleX, fltCircleY, 50, 50);
    fltCircleX += fltCirSpeedX;
    fltCircleY += fltCirSpeedY;

    if (fltCircleX > width -25 || fltCircleX < 0 + 25){
      fltCirSpeedX *= -1;

    }
    if (fltCircleY > height -25  || fltCircleY < 0 + 25){
      fltCirSpeedY *= -1;
    }

    image(imgBluePaddle, fltPaddleX, fltPaddleY);
    fltPaddleX += fltPaddleSpeedX;
    if (fltPaddleX < 0 + 20 || fltPaddleX > width - 20){
      fltPaddleSpeedX *= -1;
    }

    for (int i = 0; i < 50; i++){
      if (fltCircleX + i == fltPaddleX && fltCircleY + i == fltPaddleY){
        fltCirSpeedX *= -1;
        fltCirSpeedY *= -1;
      
      }


    }

  }
  
  // define other methods down here.
}