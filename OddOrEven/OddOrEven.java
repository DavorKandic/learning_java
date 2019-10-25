import java.io.*;
/**
 * Write a description of class OddOrEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddOrEven
{
    // instance variables - replace the example below with your own
    public static int even;
    public static int odd;

    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args) throws IOException
    {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(reader.readLine());
        
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
