import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {


  PImage imgBluePaddle;
  PImage imgRedPaddle;
  
  
  float fltCirSpeedY = 5;
  float fltCirSpeedX = 5;

  float fltCircleX = 202;
  float fltCircleY = 274;

  float fltPaddleX = 200;
  float fltPaddleY = 100;

  float fltBluePaddleSpeed = 5;
	
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

    ellipse(fltCircleX, fltCircleY, 25, 25);
    
    fltCircleY += fltCirSpeedY;
    fltCircleX += fltCirSpeedX;

    if (fltCircleY > height -25  || fltCircleY < 0 + 25){
      fltCirSpeedY *= -1;
    }
    if (fltCircleX > width - 25 || fltCircleX < 0 + 25){
      fltCirSpeedX *= -1;
    }

    image(imgBluePaddle, fltPaddleX, fltPaddleY);
    fltPaddleX += fltBluePaddleSpeed;
    if (fltPaddleX < 0 + 20 || fltPaddleX > width - 20){
      fltBluePaddleSpeed *= -1;
    }
    if (fltCircleX > fltPaddleX && fltCircleX < fltPaddleX + 100){
      if (fltCircleY > fltPaddleY && fltCircleY < fltPaddleY + 45){
        fltCirSpeedY *= -1;
        fltCirSpeedX *= -1;

      }
    }

      
      


  }

}
  
  // define other methods down here.
