import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/
public class Longestsequence {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++)
            list.add(Integer.parseInt(reader.readLine()));
        findSeq(list);
    }
    
    public static void findSeq(ArrayList<Integer> ls) {
        int countReps = 0;
        int maxCount = 0;
        for (Integer num: ls){
            countReps = 0;
            for(int i=0; i<ls.size(); i++){
                if(ls.get(i).equals(num))
                    countReps++;
                else{ 
                    if (countReps > maxCount)
                        maxCount = countReps;
                    countReps = 0;
                }
                    
            }
        }
        if (countReps > maxCount)
                maxCount = countReps;
            System.out.println(maxCount);
        
    }
}
