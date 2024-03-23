//Charles Owens
//CSCI 2010/2011
//W1
package csci2011.owenslab3;
/**
 * @author Charles Owens
 */
//child class of RegularPolygon, which is a child of Polygon
public class RegularTriangle extends RegularPolygon {
    //private variable
    private double height;

    //constructor with 1 param used to set height variable
    public RegularTriangle(double newSideLength) {
        super(3, newSideLength);
        setHeight(Math.sqrt(3) * newSideLength / 2);
    }

    //override side length mutator from RegularPolygon class, then set height
    public void setSideLength(double newSideLength) {
        super.setSideLength(newSideLength);
        // Recalculate and set the height based on the new side length
        this.height = Math.sqrt(3) * newSideLength / 2;
    }
    
    //getter for height variable
    public double getHeight() {
        return height;
    }

    //setter for height variable
    public void setHeight(double newHeight) {
        if (newHeight <= 0) {
            System.out.println("Error. Height must be greater than zero.");
            System.exit(0);
        }
        this.height = newHeight;
        super.setSideLength(2 * newHeight / Math.sqrt(3));
    }

    //method to calculate the area of this object
    public double getArea() {
        return 0.5 * getSideLength() * height;
    }

    //method to display messages about this object
    public String toString() {
        return super.toString() +
                "\nHeight: " + height +
                "\nArea: " + getArea();
    }
}
