
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min;
    private double max;
    private double increment;
    
    /**
     * Constructor for objects of class Heater
    */
    
    public Heater(double maxAmount, double minAmount)
    {
        temperature = 15.0;
        max = maxAmount;
        min = minAmount;
        increment = 5.0;
    }
    
    public double warmer()
    {
        if (temperature < max)
        {
            temperature = temperature + increment;
            return temperature;
        }
        else
        {
            return temperature;
        }
    }

    public double cooler()
    {
        if (temperature > min)
        {
            temperature = temperature - increment;
            return temperature;
        }
        else
        {
            return temperature;
        }
    }
    
    public void setIncrement (double incrementValue)
    {
        if (incrementValue > 0)
        {
            increment = incrementValue;
        }      
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void showTemperature()
    {
        System.out.println("The price of the ticket is " + temperature);
    }
}
