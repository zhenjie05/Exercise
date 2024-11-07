package l2q5;

import java.util.Random;

public class L2Q5 {
  
    public static void main(String[] args) {
        
        // generate random number from 0 to 10000
        Random g =new Random();
        int num = g.nextInt(10001);
        System.out.println("Random number: " + num);
        
        // calculate sum of digits
        int sum = 0;
        while (num > 0){
            sum += num%10;
            num /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
    
}
