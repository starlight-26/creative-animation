import org.code.theater.*;
import org.code.media.*;

public class Bottom extends Clothing {

    private String size;
    private double price;
    private String length;
    private boolean isSkirt;

    public Bottom(String file, String size, double price, String length, boolean isSkirt) {
      super(file, size, price);
      this.size = size;
      this.price = price;
      this.length = length;
      this.isSkirt = isSkirt;
    }

  /**
   * Returns the length of the bottom
   * @return A string that specifies the length of the bottom
   */
    public String getLength() {
      return length;
    }

  /**
   * Returns is the bottom is a skirt
   * @return A boolean value
   */
    public boolean getIsSkirt() {
      return isSkirt;
    }

  /**
   * Returns a string that contains all the information about the object
   * @return A string containg information abou the object
   */
    public String toString() {
      return "Size: " + size + "\nPrice: $" + price + "\nLength: " + length + "\nIs a Skirt? " + isSkirt;
    }
    
    
}