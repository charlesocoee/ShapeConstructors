//Charles Owens
//CSCI 2010/2011
//W1
package csci2011.owenslab3;
/**
 * @author Charles Owens
 */
public class OwensLab3 {

    public static void main(String[] args) {
        //Create a polygon object and display the results 
        System.out.println("Testing the Polygon constructor");
        Polygon polygon = new Polygon(4);
        System.out.println(polygon.toString());
        //Polygon object created with invalid number of sides to demo it works correctly
        //Polygon invalidPolygon = new Polygon(2);

        //Create a RegularPolygon object & display it
        System.out.println("\nTesting the RegularPolygon constructor");
        RegularPolygon regularPolygon = new RegularPolygon(5, 1.0);
        System.out.println(regularPolygon.toString());

        //Call RegularPolygon's side length mutator, and display the object again
        System.out.println("\nTesting side length mutator");
        regularPolygon.setSideLength(2.0);
        System.out.println(regularPolygon.toString());

        //create a RegularTriangle object and display its message
        System.out.println("\nTesting RegularTriangle constructor");
        RegularTriangle triangle = new RegularTriangle(4.0);
        System.out.println(triangle.toString());

        //call the RegularTriangle's height mutator and display its message
        System.out.println("\nTesting height mutator");
        triangle.setHeight(3.0);
        System.out.println(triangle.toString());

        //call the side length mutator and display its message
        System.out.println("\nTesting side length mutator");
        triangle.setSideLength(4.0);
        System.out.println(triangle.toString());
    }
}
