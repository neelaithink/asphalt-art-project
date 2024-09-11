import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the Painter to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Choice A: Takes all paint from a paint bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // Choice B: Moves forward while a Painter object can move
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  // Choice C: Paints and moves while the Painter object has paint
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }

  // Choice D: Moves, turns, and paints in a donut shape
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }
// paints a diagonal line from the left to right down.
  public void paintDglOne(String color) {
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    turnRight();
    turnLeft();
    move();
    turnRight();
    move();
    paint(color);
  }
  // paints a diagonal line from the right to left down.
  public void paintDglTwo(String color){
  turnRight();
  move();
  paint(color);
  turnLeft();
  move();
  turnRight();
  move();
  paint(color);
  move();
  turnLeft();
  move();
  paint(color);
  turnRight();
  }
  // paints a diagonal line from the right to left up.
  public void paintDglThree (String color){
  turnRight();
  move();
  paint(color);
  turnLeft();
  move();
  turnRight();
  move();
  paint(color);
  move();
  turnLeft();
  move();
  paint(color);
  turnRight();
    }
// paints a diagonal line from the left to right up.
public void paintDglFour (String color){
turnRight();
  move();

  paint(color);

}

  
}