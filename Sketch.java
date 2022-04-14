import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  

  PImage imgBluePaddle;
  PImage imgRedPaddle;
  
  float fltCirSpeedY = 10;
  float fltCirSpeedX = 10;

  float fltCircleX = 233;
  float fltCircleY = 712;

  float fltBluePaddleX = 200;
  float fltBluePaddleY = 100;

  float fltBluePaddleSpeed = 8;
  
  float fltRedPaddleX = 235;
  float fltRedPaddleY = 700;
  float fltRedPaddleSpeed = 10;
  
  int intScoreRed = 0;
  int intScoreBlue = 0;

	
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
    imgRedPaddle = loadImage("paddleRed.png");

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    background(32);

    ellipse(fltCircleX, fltCircleY, 25, 25);
    
    fltCircleY += fltCirSpeedY;
    fltCircleX += fltCirSpeedX;

    if (fltCircleY > height  || fltCircleY < 0 ){
      fltCirSpeedY *= -1;
    }
    if (fltCircleX > width - 25 || fltCircleX < 0 + 25){
      fltCirSpeedX *= -1;
    }

    image(imgBluePaddle, fltBluePaddleX, fltBluePaddleY);
    fltBluePaddleX += fltBluePaddleSpeed;
    if (fltBluePaddleX < 0 + 20 || fltBluePaddleX > width - 80){
      fltBluePaddleSpeed *= -1;
    }

    image(imgRedPaddle, fltRedPaddleX, fltRedPaddleY);
    fltRedPaddleX += fltRedPaddleSpeed;
    fltRedPaddleY = ((fltRedPaddleX-400) * (fltRedPaddleX-400)) / 800 +500;
    if (fltRedPaddleX < 0 + 20 || fltRedPaddleX > width - 80){
      fltRedPaddleSpeed *= -1;
      
    }
    if (fltCircleX > fltRedPaddleX && fltCircleX < fltRedPaddleX + 100){
      if (fltCircleY > fltRedPaddleY -6 && fltCircleY < fltRedPaddleY + 20){
        if (fltRedPaddleSpeed < 0 ){
          fltCirSpeedX = -5;
          fltCirSpeedY *= -1;
        }
        if (fltRedPaddleSpeed > 0){
          fltCirSpeedX = 5;
          fltCirSpeedY *= -1;
        }
      }
    }

    if (fltCircleX > fltBluePaddleX && fltCircleX < fltBluePaddleX + 100){
      if (fltCircleY > fltBluePaddleY -6 && fltCircleY < fltBluePaddleY + 20){
        if (fltBluePaddleSpeed < 0){
          fltCirSpeedX = -5;
          fltCirSpeedY *= -1;
        }
        if (fltBluePaddleSpeed > 0){
          fltCirSpeedX = 5;
          fltCirSpeedY *= -1;
        }
      }
    }
    if (fltCircleY - 20 <= 0){
      intScoreRed += 1;
    }
    fill(255,255,255);
    textSize(50);
    text(intScoreRed, 100, 100);
    if (fltCircleY + 20 >= height){
      intScoreBlue += 1;
    
    }
    text(intScoreBlue, 700, 100);
  }
}
    
  



    
    

  
      

  


  


  
  // define other methods down here.
