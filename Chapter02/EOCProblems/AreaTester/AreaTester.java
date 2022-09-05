/**
 * Write a description of class AreaTester here.
 *
 * @author Michael Angelo Catapang
 * @version 09/01/22
 */
public class AreaTester
{
    public void AreaTester() {
        Rectangle r = new Rectangle();
        int w = r.getWidth();
        int h = r.getHeight();
        System.out.println("The area of the rectangle is " + (w*h));
    }
    
    public void PrintSampleDimensions() {
        Rectangle r1 = new Rectangle(4, "area");
        r1.getDimensions();
        
        Rectangle r2 = new Rectangle(6, "perimeter");
        r2.getDimensions();
    }
}