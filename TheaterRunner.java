import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Instantiates three top objects
    Tops hoodie = new Tops("orange-hoodie.png", "large", 15.99, "orange", "plain");
    Tops shirt = new Tops("dotted-shirt.png", "small", 5.99, "pink", "polka dot");
    Tops tanktop = new Tops("striped-tanktop.png", "medium", 3.50, "blue", "stripped");
    // Creates an array to store the top objects
    Tops[] tops = {tanktop, shirt, hoodie};

    // Instantiates three bottom objects
    Bottom pants = new Bottom("pants.png", "large", 15.99, "long", false);
    Bottom skirt = new Bottom("skirt.png", "small", 5.99, "short", true);
    Bottom shorts = new Bottom("shorts.png", "medium", 3.50, "short", false);
    // Creates an array to store the bottom objects
    Bottom[] bottom = {pants, skirt, shorts};

    MyScene scene = new MyScene(tops, bottom);

    scene.drawScene();

    Theater.playScenes(scene);
    
    
  }
}