import java.io.*;
import java.util.*;

public class OddEvenNumbers{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int[] numarr = new int[10];
        System.out.println("Enter the 10 values of the array:");
        for(int i=0;i<10;i++){
            numarr[i] = input.nextInt();
        }

        System.out.println("The difference of the first and last number is: " + (numarr[0]-numarr[9]));
    }
}