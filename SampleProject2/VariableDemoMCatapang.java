import java.awt.Font;
/**
 *This example demonstrates variables and assignments.
 *
 * @author Michael Catapang
 * @version 08/30/22
 */

public class VariableDemoMCatapang
{   
    private int width;      // Declares variables for our use
    private int height;
    private Draw scrn = new Draw(); 
    public void variableDemo1( )
    {   //ref pg32
        width = 10; // After declare in ln11 you don't need to 
        // declare again. Initializes width to 10
        System.out.println("width: " + width); 
    }

    public void variableDemo2( )
    {   //ref pg32
        // QQQ Change width to 20.
        width = 20;
        System.out.println(" width=" + width);

        height = 15;     // QQQ assign 15 to height
    }

    public void variableDemo3( )
    {   //ref pg32
        //Three ways to set width to twice height
        //Disable 2 of the lines and run it again 
        width = 2*height;    
        width = height + height; 
        width = height*2;

        //print to Terminal window
        System.out.println(" The width is " + width + ". ");
        
        //print to Graphics window
        scrn.clear(Draw.GREEN);
        scrn.text(0.50,0.90, " The width is " + width + ". ");
        
        Font myFont = new Font("Arial", Font.BOLD, 70); 
        scrn.setFont( myFont );
        scrn.setPenColor(Draw.RED);
        scrn.text(0.50,0.75, " The width is " + width + ". ");
        
        myFont = new Font("Courier", Font.BOLD, 50);
        scrn.setFont(myFont);
        scrn.setPenColor(Draw.PINK);
        scrn.text(0.50,0.60, " The width is " + width + ". ");
        
        myFont = new Font("Courier", Font.PLAIN, 40);
        scrn.setFont(myFont);
        scrn.setPenColor(Draw.BLUE);
        scrn.text(0.50,0.50, " The width is " + width + ". ", 180);
    }

    public void variableDemo4( )
    {   //ref pg32
        width = width + 10; // QQQ The same variable can occur on both sides
        System.out.println(width + " is width");
    }

    public void fixMe30( )
    {
        //ref pg32    
        /* // Debug the following block of code
        int sideLength = 2;
        int cubeVolume = sideLength * sideLength * sideLength;
        System.out.print("Volume: ");
        System.out.println(cubeVolume);
        int sideLength = 10;
        int cubeVolume = sideLength * sideLength * sideLength;
        System.out.print("Cube volume: ");
        System.out.println(cubeVolume);
        int tetrahedronVolume = cubeVolume * 0.11785113019;
        System.out.print("Tetrahedron volume: ");
        System.out.println(TetrahedronVolume);
        */
       
        int sideLength = 2;
        int cubeVolume = sideLength * sideLength * sideLength;
        System.out.print("Volume: ");
        System.out.println(cubeVolume);
        sideLength = 10;
        cubeVolume = sideLength * sideLength * sideLength;
        System.out.print("Cube volume: ");
        System.out.println(cubeVolume);
        double tetrahedronVolume = cubeVolume * 0.11785113019;
        System.out.print("Tetrahedron volume: ");
        System.out.println(tetrahedronVolume);
    }
    
    public void FindDimension()
    {
        int area1 = 30;
        int area2 = 56;
        int area3 = 30;
        
        int width1 = 6;
        int length1 = area1/width1;
        
        int length2 = length1 + 3;
        int width2 = 56/length2;
        
        int length3 = length2 - 2;
        int width3 = 30 / length3;
        
        int missingDimension = width2 + width3;
        System.out.println("The missing dimension is " + missingDimension);
    }

    public void typeExample() 
    {
        // declare some data
        int numberOfIVCStudents = 12345;
        double gpa = 3.45;
        boolean isHighSchoolStudent = true;
        Clock joeClock = new Clock();
        Clock benClock = new Clock();
        
        // add a clock for paula and mark
        Clock paulaClock = new Clock();
        Clock markClock = new Clock();
        
        // joe's wristwatch should say 4:30pm
        joeClock.setHoursInt(16);
        
        
        // ben's wristwatch should say 8:45am
        benClock.setHoursInt(20);
        
        // print joe and ben's time
        System.out.println("Joe's: " + joeClock.getHours());
        System.out.println("Ben's: " + benClock.getHours());
        
        Car momFord = new Car();
    }
    
    public void DrawLots()
    {
        Draw draw = new Draw();
        
        // Face
        draw.setPenColor(Draw.MAGENTA);
        draw.circle(0.3, 0.7, 0.2);
        draw.text(0.3, 0.95, "P2.14");
        draw.line(0.2, 0.7, 0.4, 0.7);
        draw.setPenColor(Draw.RED);
        draw.filledCircle(0.2, 0.8, 0.01);
        draw.filledCircle(0.4, 0.8, 0.01);
        
        // Written By
        draw.setPenColor(Draw.BLUE);
        draw.text(0.7, 0.8, "Written by");
        draw.text(0.7, 0.75, "Michael Catapang");
        
        // Rectangle
        draw.setPenColor(Draw.BLACK);
        draw.rectangle(0.3, 0.25, 0.15, 0.2);
        draw.line(0.3, 0.05, 0.3, 0.45);
        draw.line(0.15, 0.25, 0.45, 0.25);
        draw.text(0.20, 0.30, "P2.1");
        
        // Squares
        draw.setPenColor(Draw.GREEN);
        draw.square(0.75, 0.3, 0.2);
        draw.setPenColor(Draw.RED);
        draw.setPenRadius(0.1);
        draw.square(0.75, 0.3, 0.1);
        draw.text(0.75, 0.3, "P2.3");
    }
}

