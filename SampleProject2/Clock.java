public class Clock {
    /*
        Instance variables - replace the example below
        We dcided to focus on two data - hours and minutes
        We don't care about price, weight, style, etc.
            (there's many datas that can be
            attributed to a clock)
    */
    private int hours;
    private int mins;

    // constructors


    // mutators
    public void setHoursInt(int newHours)
    {
        this.hours = newHours;
    }
    
    // accessors
    public int getHours()
    {
        return this.hours;
    }
}
