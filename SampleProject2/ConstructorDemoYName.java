import java.awt.Font;

/**
 * This example demonstrates constructors.
 *
 * @author Michael Catapang
 * @version 08/30/22
 */
public class ConstructorDemoYName
{
    //Note: different from pg38 
    private String first;
    private String last;
    public void ex1( )
    {
        // Constructs graphics win & two Strings
        Draw win = new Draw( );
        // QQQ change this to your name
        first = new String("James");
        last  = new String("Green");

        // Display on terminal 
        System.out.println("Name is "
            +first+" "+last);
        // Display on graphics window 
        // QQQ change this to display name on
        // top left corner in RED
        win.text(0.50,0.90,first);
        win.text(0.50,0.80,last);
    }

    public void ex2( )
    {
        // Constructs graphics win & two Strings
        Draw screen = new Draw( );

        first = new String("Amy");
        last  = new String("Torres");

        // Display on terminal 
        System.out.println("Name is "
            +first+" "+last);

        // Display on graphics window
        // QQQ change this to display name
        // upside down
        screen.setPenColor(Draw.RED);
        screen.text(0.40,0.70,first,180);
        screen.text(0.60,0.70,last);
    }

    public void ex3( )
    {
        // Constructs graphics win & two Strings
        // Construct one String and extract first,last name
        Draw scrn = new Draw( );
        
        // QQQ change this to your name
        String name = new String("Emily Park");
        first = name.substring(0,5);
        last  = name.substring(6);

        // Display on graphics window
        // QQQ change this to display name in large 
        // size 50 font, blue text, Cyan background
        // 
        Font fnt = new Font("Monospaced", Font.BOLD, 12);
        scrn.setFont( fnt );
        scrn.text(0.35,0.60,first);
        scrn.text(0.65,0.60,last);
    }
}

