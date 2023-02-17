import java.io.*;
import java.util.*;

public class MaximumMinimum{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the length of the array: ");
        num = input.nextInt();

        int[] numarr = new int[num];
        int max=0,min=0,min2=0;
        System.out.println("Enter the " + num + " elements of the array:");
        for(int i=0;i<num;i++){
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
        min2 = max;
        for(int i=0;i<num;i++){
            if(numarr[i]<min2 && numarr[i]>min)
                min2 = numarr[i];
        }

        

        System.out.println("Maximum difference: " + max + "-" + min + " = " + (max-min));
        System.out.println("Minimum difference: " + min2 + "-" + min + " = " + (min2-min));
    }
}