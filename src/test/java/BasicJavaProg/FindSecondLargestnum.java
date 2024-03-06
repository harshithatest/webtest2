package BasicJavaProg;

import java.util.Arrays;

public class FindSecondLargestnum {
    public static void main(String[] args) {
        int arr[]={22,5,4,7,12,8,3,14,39,64,3};
        int largest=Arrays.stream(arr).min().getAsInt();
        int secondlargest=Arrays.stream(arr).min().getAsInt();
        //int ThirdLargestnum=Arrays.stream(arr).min().getAsInt();
        for(int num:arr){
            if(num>largest){
            //	ThirdLargestnum=secondlargest;
                secondlargest=largest;
                largest=num;
            }else{
                if(num>secondlargest && num<largest ){
                	secondlargest=num;
                }
            }
           
        }System.out.print(secondlargest);
    }
}
