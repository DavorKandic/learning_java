/* 
Maximum of four numbers

*/

import java.io.*;

public class Maxes {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String strInt1 = read.readLine();
        String strInt2 = read.readLine();
        String strInt3 = read.readLine();
        String strInt4 = read.readLine();
        int a = Integer.parseInt(strInt1);
        int b = Integer.parseInt(strInt2);
        int c = Integer.parseInt(strInt3);
        int d = Integer.parseInt(strInt4);
        int max = largest(a,b,c,d);
        int count = countMaxes(max,a,b,c,d);
        for (int i=0; i<count; i++) {
            System.out.print(max + " ");
        }
		
	}
    public static int largest(int a, int b, int c, int d) {
        int max;
        if (a>b)
            if (a>c)
                if (a>d)
                    max = a;
                else 
                    max = d;
            else  
                if (c>d)
                    max = c;
                else
                    max = d;
        else 
            if (b>c)
                if (b>d)
                    max = b;
                else 
                    max = d;
            else
                if (c>d)
                    max = c;
                else
                    max = d;
                    
        return max;
		
		}
    
    public static int countMaxes(int max, int a, int b, int c, int d) {
        int count = 0;
        int nums[] ={a, b, c, d};
        for (int i=0; i<nums.length; i++){
            if (nums[i] == max)
                count++;
        }
        return count;
            
        
    }
}
        
        
                    