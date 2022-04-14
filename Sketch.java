import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {


  PImage imgBluePaddle;
  PImage imgRedPaddle;
  
  
  float fltCirSpeedY = 15;
  float fltCirSpeedX = 15;

  float fltCircleX = 202;
  float fltCircleY = 274;

  float fltPaddleX = 200;
  float fltPaddleY = 100;

  float fltBluePaddleSpeed = 8;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);

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
    if (fltPaddleX < 0 + 20 || fltPaddleX > width - 80){
      fltBluePaddleSpeed *= -1;
    }
 
    if (fltCircleX > fltPaddleX && fltCircleX < fltPaddleX + 100){
      if (fltCircleY > fltPaddleY -6 && fltCircleY < fltPaddleY + 20){
        if (fltBluePaddleSpeed < 0 ){

          fltCirSpeedX = -5;
          fltCirSpeedY *= -1;
        }

    
        if (fltBluePaddleSpeed > 0){
         
          fltCirSpeedX = 5;
          fltCirSpeedY *= -1;
        }
        
        }
      }

    
    

  }
      
    }

  


  
  // define other methods down here.
