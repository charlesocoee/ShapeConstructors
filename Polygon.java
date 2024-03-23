//Charles Owens
//CSCI 2010/2011
//W1
package csci2011.owenslab3;
/**
 * @author Charles Owens
 */
public class Polygon {
    //private variable
    private int numOfSides;

    //constructor with 1 param that initializes the private variable
    public Polygon(int numSides) {
        if (numSides < 3) {
            System.err.println("Error: Number of sides must be at least 3.");
            System.exit(0);
        }
        this.numOfSides = numSides;
    }

    //getter for numOfSides variable
    public int getNumSides() {
        return numOfSides;
    }

    //display message to show the Polygon's number of sides
    public String toString() {
        return "Number of sides: " + numOfSides;
    }
}
