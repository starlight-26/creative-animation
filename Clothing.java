import org.code.theater.*;
import org.code.media.*;

public class Clothing {

    private String file;
    private String size;
    private double price;

    public Clothing(String file, String size, double price) {
      this.file = file;
      this.size = size;
      this.price = price;
    }

  /**
   * Returns the image file of the object
   * @return A string containing the image file
   */
    public String getFile() {
      return file;
    }

  /**
   * Returns the size of the clothing
   * @return A string that specifys the size
   */
    public String getSize() {
      return size;
    }

  /**
   * Returns the price of the clothing
   * @return A string that contains the price
   */
    public String getPrice() {
      return Double.toString(price);
    }

  /**
   * Returns a string that contains all the information about the object
   * @return A string containg information abou the object
   */
    public String toString() {
      return "Size: " + size + "\nPrice: $" + price;
    }
    

}