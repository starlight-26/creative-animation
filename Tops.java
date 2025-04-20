import org.code.theater.*;
import org.code.media.*;

public class Tops extends Clothing {

    private String size;
    private double price;
    private String color;
    private String design;

    public Tops(String file, String size, double price, String color, String design) {
      super(file, size, price);
      this.size = size;
      this.price = price;
      this.color = color;
      this.design = design;
    }

  /**
   * Returns the color of the top
   * @return A string that is a color name
   */
    public String getColor() {
      return color;
    }

  /**
   * Returns the design of a top
   * @return A string that specifys a design
   */
    public String getDesign() {
      return design;
    }

  /**
   * Returns a string that contains all the information about the object
   * @return A string containg information abou the object
   */
    public String toString() {
      return "Size: " + size + "\nPrice: $" + price + "\nColor: " + color + "\nDesign: " + design;
    }
    
    
}