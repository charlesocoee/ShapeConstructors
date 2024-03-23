//Charles Owens
//CSCI 2010/2011
//W1
package csci2011.owenslab3;
/**
 * @author Charles Owens
 */
//A child class of the Polygon (parent) class
public class RegularPolygon extends Polygon {
    //private variable
    private double lengthOfSide;

    //constructor with 2 params to set lengthOfSide variable
    public RegularPolygon(int numOfSides, double newSideLength) {
        super(numOfSides);
        setSideLength(newSideLength);
    }

    //setter for lengthOfSide variable
    public void setSideLength(double sideLength) {
        if (sideLength <= 0) {
            System.out.println("Error. Side length must be greater than zero.");
            System.exit(0);
        }
        this.lengthOfSide = sideLength;
    }

    //getter for lengthOfSide variable
    public double getSideLength() {
        return lengthOfSide;
    }

    //method to calculate the perimeter of a regular polygon
    public double getPerimeter() {
        return getNumSides() * lengthOfSide;
    }

    //method to display the side length and perimeter of this object
    public String toString() {
        return super.toString() +
                "\nSide length: " + lengthOfSide +
                "\nPerimeter: " + getPerimeter();
    }
}
