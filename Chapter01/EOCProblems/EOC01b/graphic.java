
/**
 * Write a description of class graphic here.
 *
 * @author Michael Catapang
 * @version 08/25/22
 */
public class graphic
{
    public void E1_5()
    {
        Draw screen = new Draw();
        
        // Create rectangle
        screen.rectangle(0.50, 0.50, 0.20, 0.10);
        
        // Write name
        String name = "Michael";
        screen.text(0.50, 0.50, name);
    }
    
    public void E1_6()
    {
        Draw screen = new Draw();
        
        // "M"
        screen.line(0.10, 0.90, 0.10, 0.10);
        screen.line(0.10, 0.90, 0.20, 0.80);
        screen.line(0.20, 0.80, 0.30, 0.90);
        screen.line(0.30, 0.90, 0.30, 0.10);
        
        // "I"
        screen.line(0.50, 0.90, 0.50, 0.10);
        
        // "C"
        screen.line(0.90, 0.90, 0.80, 0.70);
        screen.line(0.80, 0.70, 0.80, 0.30);
        screen.line(0.80, 0.30, 0.90, 0.10);
        
    }
}