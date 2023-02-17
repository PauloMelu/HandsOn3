import java.io.*;
import java.util.*;

public class BiggestSmallest{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] numarr = new int[10];
        int max=0,min=0;
        System.out.println("Enter the 10 values of the array:");
        for(int i=0;i<10;i++){
            numarr[i] = input.nextInt();
            if(i==0){
                max = numarr[i];
                min = numarr[i];
            }else{
                if(numarr[i]>max)
                    max = numarr[i];
                if(numarr[i]<min)
                    min = numarr[i];
            }
        }

        System.out.println("The highest value is: " + max);
        System.out.println("The smallest value is: " + min);
    }
}