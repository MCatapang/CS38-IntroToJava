public class SampleProject
{
    public static void main(String[] args)
    {
        SampleProject mainObject = new SampleProject();
        mainObject.sample2();
    }

    public void sample1()
    {
        // /*
        //  * Commented out due to issues with the Draw library
        //  */
        // int ageMom = 45;
        // int ageDad = 47;
        // int ageSis = 16;
        // int ageBro = 24;
        // System.out.println("Mom is " + ageMom);
        // Draw window = new Draw();
        // window.clear(Draw.GRAY);
        // window.setPenColor(Draw.GREEN);
        // String msg = "Mom is " + ageMom;
        // window.text(0.5, 0.9, msg);
    }

    public void sample2()
    {
        /*
         * Declare the price of gas for a 76 station on Alton
         * Declare that it has 8000 gallons for capacity
         */
        double priceAt76 = 5.96;
        double capacity = 8000.0;
        // A Ford buys 10.5 gals
        // A Toyota buys 13.25 gals
        // How much sales were made?
        // How much gas is now left at the 76 station?
        double gasSale_Ford = 10.5;
        double gasSale_Toyota = 13.25;
        double totalSales = (gasSale_Ford + gasSale_Toyota) * priceAt76;
        double gasRemaining = capacity - (gasSale_Ford + gasSale_Toyota);
        
        System.out.println(String.format(
            "The total sale was %f", totalSales
        ));
        System.out.println(String.format(
            "The gas capacity remaining is %f", gasRemaining
        ));
        System.out.println(totalSales);
    }

    public void sample3()
    {
        
    }

    public void graphic1()
    {
        // /*
        //  * Commented out due to issues with the Draw library
        //  */
        // Draw screen = new Draw();

        // /* explain */
        // screen.line(0.10, 0.90, 0.90, 0.10);

        // /* explain */
        // screen.setPenRadius(0.02);

        // /* explain */
        // screen.line(0.30, 0.80, 0.70, 0.20);

        // /* explain */
        // screen.setPenColor(Draw.RED);
        // screen.line(0.20, 0.90, 0.90, 0.90);

        // /* explain */
        // screen.rectangle(0.50, 0.50, 0.20, 0.10);
    }
}