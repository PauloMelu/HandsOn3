import java.io.*;
import java.util.*;

public class ArraySearch{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] numarr = new int[15];
        int pos=0,neg=0,odd=0,even=0,zeros=0;
        System.out.println("Enter the 15 values of the array:");
        for(int i=0;i<15;i++){
            numarr[i] = input.nextInt();
            if(numarr[i]>0)
                pos++;
            else if(numarr[i]<0)
                neg++;
            else
                zeros++;
            if(numarr[i]%2==0)
                even++;
            else
                odd++;
        }

        
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of 0s numbers: " + zeros);
    }
}