
/**
 * Write a description of class Rectangle here.
 *
 * @author Michael Angelo Catapang
 * @version 09/01/22
 */
public class Rectangle
{
    private int width;
    private int height;
    private int area;
    private int perimeter;
    
    public Rectangle()
    {
        this.width = 5;
        this.height = 4;
    }
    
    public Rectangle(int val, String msg)
    {
        if(msg == "area") {
            this.area = val;
            this.width = val;
            this.height = 1;
            this.perimeter = 2*(this.width + this.height);
        } else if (msg == "perimeter") {
            this.perimeter = val;
            this.height = 1;
            this.width = (val-2)/2;
            this.area = this.width * this.height;
        }
    }

    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public void getDimensions()
    {
        System.out.println("width: " + this.width);
        System.out.println("height: " + this.height);
        System.out.println("area: " + this.area);
        System.out.println("perimeter: " + this.perimeter);
    }
}
