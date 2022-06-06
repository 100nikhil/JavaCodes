import java.util.Scanner;
import java.math.BigInteger;

public class CheckForPrimeQuickly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();
        if(new BigInteger(String.valueOf(num)).isProbablePrime(1)){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}