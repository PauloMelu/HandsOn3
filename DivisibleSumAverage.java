import java.io.*;

public class DivisibleSumAverage{
    public static void main(String [] args){
        
        int sum=0;
        System.out.println("The first 10 whole numbers divisible by 8 are:");
        for(int i=1;i<=10;i++){
            System.out.println(i*8);
            sum += i*8;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum/10);
    }
}