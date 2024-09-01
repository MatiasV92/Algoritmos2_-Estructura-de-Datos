
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name; 
    private int age;
    private String code;
    private int credits;
    
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getAge()
    {
        return age;
    }

    public void setAge ( int ageParam )
    {
        age = ageParam;
    }
    
    public String getName ()
    {
        return name;
    }

    public void setName ( String nameParam )
    {
        name = nameParam;
    }
    
    public void prntDetail()
    {
        System.out.println("The name of this person is " + name );
    }

}

