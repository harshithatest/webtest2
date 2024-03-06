package interviewjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeduplicatStr {
    public static void main (String args[] )
            {
            String str = "hello bye hello";
         String[] word= str.split(" ");
            Set<String> unique= new HashSet<String>();
            unique.addAll(Arrays.asList(word));
                System.out.println(unique);
                
            for(String w:word){
                unique.add(w);
            }
            System.out.println(unique+ " ");
    }
}
