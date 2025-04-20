import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;

public class MyScene extends Scene {

  private Tops[] tops;
  private Bottom[] bottoms;

  public MyScene(Tops[] tops, Bottom[] bottoms) {
    this.tops = tops;
    this.bottoms = bottoms;
  }

  /**
   * Plays music and all the draw methods
   */
  public void drawScene() {
    playSound("dress-to-impress.wav");
    drawTops();
    pause(1.5);
    clear("white");
    drawBottoms();
    pause(1.5);
    clear("white");
    drawFinal();
  }

  /**
   * Draws the top scene
   */
  private void drawTops() {
    int xCoord = 25;
    for (Tops i : tops) {
      drawImage(i.getFile(), xCoord, 100, 200);
      xCoord += 80;
      pause(0.1);
    }
  }

  /**
   * draws the bottom scene
   */
  private void drawBottoms() {
    int xCoord = 25;
    for (Bottom i : bottoms) {
      drawImage(i.getFile(), xCoord, 100, 200);
      xCoord += 90;
      pause(0.1);
    }
  }

  /**
   * Draws the final scene
   */
  private void drawFinal() {
    drawImage("mannequin.png", 100, 20, 350);
    drawImage(bottoms[1].getFile(), 210, 112, 125);
    drawImage(tops[0].getFile(), 215, 52, 120);

    drawText("Top Info:", 25, 75);
    drawText("Price: $" + tops[0].getPrice(), 25, 100);
    drawText("Size: " + tops[0].getSize(), 25, 125);
    drawText("Color: " + tops[0].getColor(), 25, 150);
    drawText("Design: " + tops[0].getDesign(), 25, 175);

    drawText("Bottom Info:", 25, 225);
    drawText("Price: $" + bottoms[1].getPrice(), 25, 250);
    drawText("Size: " + bottoms[1].getSize(), 25, 275);
    drawText("Length: " + bottoms[1].getLength(), 25, 300);
  }

  
}