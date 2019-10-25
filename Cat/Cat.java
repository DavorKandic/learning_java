
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat
{
   



    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    protected void finalize() throws Throwable {
        System.out.println("A Cat was destroyed.");
    }
    
    public static void main(String[] args) throws Throwable {
    
    Cat cat = new Cat();
    
    cat.finalize();

    }
}
